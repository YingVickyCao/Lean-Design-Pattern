package com.hades.example.designpatterns.pattern.mvvm.v

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.hades.example.designpatterns.R

// MVVM Ref - https://rachel53461.wordpress.com/2011/05/08/simplemvvmexample/
class MVVMExampleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvvm)
    }
}
