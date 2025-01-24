package com.hades.example.designpatterns;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.hades.example.designpatterns.pattern.mvp.v.MVPExampleActivity;
import com.hades.example.designpatterns.pattern.mvvm.v.MVVMExampleActivity;
import com.hades.example.designpatterns.pattern.mvc.v1.c.MVCExampleActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.mvc).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, MVCExampleActivity.class)));
        findViewById(R.id.mvc2).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, com.hades.example.designpatterns.pattern.mvc.v2.v.MVCExampleActivity.class)));
        findViewById(R.id.mvp).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, MVPExampleActivity.class)));
        findViewById(R.id.mvvc).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, MVVMExampleActivity.class)));
    }
}
