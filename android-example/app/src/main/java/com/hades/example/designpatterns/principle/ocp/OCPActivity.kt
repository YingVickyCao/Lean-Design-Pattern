package com.hades.example.designpatterns.principle.ocp

import com.hades.example.designpatterns.principle.BaseImageLoaderActivity
import com.hades.example.designpatterns.principle.IImageLoader

/**
 * 开放关闭原则 Open-Close Responsibility Principle（OCP)
 * Example : Image loader
 * Before: Image loader + Memory Image Cache
 * After : Image loader + Memory Image Cache + Dish cache
 */
class OCPActivity : BaseImageLoaderActivity() {
    override fun getTitleDesc(): String {
        return "Open-Close Principle"
    }

    override fun createImageLoader(): IImageLoader {
        return ImageLoader()
    }
}