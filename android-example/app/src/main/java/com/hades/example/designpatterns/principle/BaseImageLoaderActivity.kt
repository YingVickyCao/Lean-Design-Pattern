package com.hades.example.designpatterns.principle

import android.graphics.Bitmap
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.hades.example.designpatterns.R

abstract class BaseImageLoaderActivity : AppCompatActivity(), LoadImageCallback {
    protected lateinit var titleView: TextView
    private lateinit var loadingView: View
    private lateinit var imageView: ImageView
    private lateinit var loadImageButton: Button

    private var imageLoader: IImageLoader? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load_image)

        titleView = findViewById(R.id.title)
        titleView.setText(getTitleDesc())

        loadingView = findViewById(R.id.loadingView)
        imageView = findViewById(R.id.imageView)
        loadImageButton = findViewById(R.id.loadImage)

        loadImageButton.setOnClickListener {
            loadImageButton.isEnabled = false
            onClicklLoadImage()
        }
    }

    abstract fun getTitleDesc(): String

    private fun onClicklLoadImage() {
        if (null == imageLoader) {
            imageLoader = createImageLoader()
        }
        imageLoader?.displayImage("https://s2.51cto.com/images/blog/202308/22172305_64e47e79364be13990.jpg", this)
    }

    abstract fun createImageLoader(): IImageLoader

    override fun showLoadingView() {
        runOnUiThread {
            loadingView.visibility = View.VISIBLE
        }
    }

    override fun hideLoadingView() {
        runOnUiThread {
            loadingView.visibility = View.GONE
            loadImageButton.isEnabled = true
        }
    }

    override fun displayImage(bitmap: Bitmap) {
        runOnUiThread {
            imageView.setImageBitmap(bitmap)
        }
    }

    override fun setTag(url: String) {
        imageView.setTag(url)
    }

    override fun getTag(): Any {
        return imageView.getTag()
    }
}