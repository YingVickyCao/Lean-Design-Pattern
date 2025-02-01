package com.hades.example.designpatterns.principle.srp

import com.hades.example.designpatterns.principle.BaseImageLoaderActivity
import com.hades.example.designpatterns.principle.IImageLoader

/**
 * 单一原则Single Responsibility Principle（SRP)
 * Example : Image loader
 * Before: Image Loader is a single class.
 * After : Image loader + Memory Image Cache
 */
class SRPActivity : BaseImageLoaderActivity() {
    override fun getTitleDesc(): String {
        return "Single Responsibility Principle"
    }

    override fun createImageLoader(): IImageLoader {
        return ImageLoader()
    }
}