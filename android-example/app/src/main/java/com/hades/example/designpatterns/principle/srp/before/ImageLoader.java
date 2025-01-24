package com.hades.example.designpatterns.principle.srp.before;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.util.LruCache;
import android.view.View;
import android.widget.ImageView;

import com.hades.example.designpatterns.principle.srp.LoadImageCallback;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.BitSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ImageLoader {
    private static final String TAG = "ImageLoader";
    // Image Cache
    LruCache<String, Bitmap> imageCache;
    // Cache pool, The thread num is same with cpu num
    ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    public ImageLoader() {
        initImageCache();
    }

    private void initImageCache() {
        // check the max memory
        final int maxMemory = (int) Runtime.getRuntime().maxMemory() / 1024;
        final int cacheSize = maxMemory / 4;

        imageCache = new LruCache<>(cacheSize) {
            @Override
            protected int sizeOf(String key, Bitmap value) {
                return value.getRowBytes() * value.getHeight() / 1024;
            }
        };
    }

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
