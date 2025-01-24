package com.hades.example.designpatterns.principle.srp

import android.graphics.Bitmap
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.hades.example.designpatterns.R
import com.hades.example.designpatterns.principle.srp.before.ImageLoader

class SRPActivity : AppCompatActivity(), LoadImageCallback {
    private lateinit var loadingView: View
    private lateinit var imageView: ImageView
    private lateinit var loadImage: View

    private var imageLoader: ImageLoader? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_srp)

        loadingView = findViewById(R.id.loadingView)
        imageView = findViewById(R.id.imageView)

        loadImage = findViewById(R.id.loadImage)
        loadImage.setOnClickListener {
            loadImage.isEnabled = false
            onClicklLoadImage()
        }
    }

    private fun onClicklLoadImage() {
        if (null == imageLoader) {
            imageLoader = ImageLoader()
        }
        imageLoader?.displayImage("https://s2.51cto.com/images/blog/202308/22172305_64e47e79364be13990.jpg", this)
    }

    override fun showLoadingView() {
        runOnUiThread {
            loadingView.visibility = View.VISIBLE
        }
    }

    override fun hideLoadingView() {
        runOnUiThread {
            loadingView.visibility = View.GONE
            loadImage.isEnabled = true
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