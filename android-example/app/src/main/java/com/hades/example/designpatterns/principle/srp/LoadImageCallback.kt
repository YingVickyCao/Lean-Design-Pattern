package com.hades.example.designpatterns.principle.srp

import android.graphics.Bitmap

interface LoadImageCallback {
    fun showLoadingView()
    fun hideLoadingView()
    fun displayImage(bitmap: Bitmap)
    fun setTag(url:String)
    fun getTag():Any
}