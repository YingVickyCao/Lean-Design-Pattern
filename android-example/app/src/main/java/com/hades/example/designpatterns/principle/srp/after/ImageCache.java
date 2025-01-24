package com.hades.example.designpatterns.principle.srp.after;

import android.graphics.Bitmap;
import android.util.LruCache;

public class ImageCache {
    // Image Cache
    LruCache<String, Bitmap> imageCache;

    public ImageCache() {
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

    public void put(String url, Bitmap bitmap) {
        imageCache.put(url, bitmap);
    }

    public Bitmap get(String url){
        return imageCache.get(url);
    }
}
