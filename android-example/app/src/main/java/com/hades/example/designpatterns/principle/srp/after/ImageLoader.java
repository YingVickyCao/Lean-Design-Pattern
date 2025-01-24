package com.hades.example.designpatterns.principle.srp.after;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.util.LruCache;

import com.hades.example.designpatterns.principle.srp.LoadImageCallback;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ImageLoader {
    private static final String TAG = "ImageLoader";

    // Cache pool, The thread num is same with cpu num
    ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    ImageCache imageCache = new ImageCache();

    public Bitmap downloadImage(String imageUrl) {
        Bitmap bitmap = null;
        try {
            URL url = new URL(imageUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            bitmap = BitmapFactory.decodeStream(connection.getInputStream());
            connection.disconnect();
        } catch (Exception exception) {
            Log.d(TAG, "downloadImage: ", exception);
        }
        return bitmap;
    }

    public void displayImage(final String url, LoadImageCallback callback) {
        callback.setTag(url);
        callback.showLoadingView();
        executorService.submit(() -> {
            Bitmap bitmap = downloadImage(url);
            if (null == bitmap) {
                callback.hideLoadingView();
                return;
            }
            if (callback.getTag().equals(url)) {
                callback.displayImage(bitmap);
            }
            imageCache.put(url, bitmap);
            callback.hideLoadingView();
        });
    }
}
