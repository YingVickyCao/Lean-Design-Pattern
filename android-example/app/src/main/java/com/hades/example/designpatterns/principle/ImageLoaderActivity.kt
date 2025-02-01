package com.hades.example.designpatterns.principle

import com.hades.example.designpatterns.principle.srp.ImageLoader


/**
 * Image Loader is a single class.
 */
class ImageLoaderActivity : BaseImageLoaderActivity() {
    override fun getTitleDesc(): String {
        return "Load Image - Origin Version"
    }

    override fun createImageLoader(): IImageLoader {
        return ImageLoader()
    }
}