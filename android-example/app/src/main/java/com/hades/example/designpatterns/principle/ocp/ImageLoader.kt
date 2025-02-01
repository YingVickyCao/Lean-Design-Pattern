package com.hades.example.designpatterns.principle.ocp

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Log
import android.util.LruCache
import com.hades.example.designpatterns.App
import com.hades.example.designpatterns.principle.IImageLoader
import com.hades.example.designpatterns.principle.LoadImageCallback
import java.io.FileOutputStream
import java.net.HttpURLConnection
import java.net.URL
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors


class ImageLoader : IImageLoader {
    // Cache pool, The thread num is same with cpu num
    var executorService: ExecutorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors())

    var imageCache: ImageCache = ImageCache()

    override fun downloadImage(imageUrl: String?): Bitmap? {
        var bitmap: Bitmap? = null
        try {
            val url = URL(imageUrl)
            val connection = url.openConnection() as HttpURLConnection
            bitmap = BitmapFactory.decodeStream(connection.inputStream)
            connection.disconnect()
        } catch (exception: Exception) {
            Log.d(TAG, "downloadImage: ", exception)
        }
        return bitmap
    }

    override fun displayImage(url: String, callback: LoadImageCallback) {
        callback.setTag(url)
        callback.showLoadingView()
        executorService.submit {
            val bitmap = downloadImage(url)
            if (null == bitmap) {
                callback.hideLoadingView()
                return@submit
            }
            if (callback.getTag() == url) {
                callback.displayImage(bitmap)
            }
            imageCache.put(url, bitmap)
            callback.hideLoadingView()
        }
    }

    companion object {
        private const val TAG = "ImageLoader"
    }
}

class ImageCache {
    // Image Cache
    var imageCache: LruCache<String, Bitmap>? = null

    init {
        initImageCache()
    }


    private fun initImageCache() {
        // check the max memory
        val maxMemory = Runtime.getRuntime().maxMemory().toInt() / 1024
        val cacheSize = maxMemory / 4

        imageCache = object : LruCache<String, Bitmap>(cacheSize) {
            override fun sizeOf(key: String?, value: Bitmap): Int {
                return value.rowBytes * value.height / 1024
            }
        }
    }

    fun put(url: String, bitmap: Bitmap) {
        imageCache!!.put(url, bitmap)
    }

    fun get(url: String): Bitmap {
        return imageCache!![url]
    }
}

class DiskCache() {
    fun get(url: String): Bitmap {
        return BitmapFactory.decodeFile(App.getInstance().cacheDir.absolutePath + "/" + url)
    }

    fun put(url: String, bitmap: Bitmap) {
        val instream: FileOutputStream? = null
        
    }
}
