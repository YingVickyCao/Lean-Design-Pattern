package com.hades.example.designpatterns.principle

import android.graphics.Bitmap

interface IImageLoader {
    fun downloadImage(imageUrl: String?): Bitmap?
    fun displayImage(url: String, callback: LoadImageCallback)
}