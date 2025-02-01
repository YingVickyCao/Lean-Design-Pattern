package com.hades.example.designpatterns;

import android.app.Application;

public class App extends Application {
    public static Application instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static Application getInstance() {
        return instance;
    }
}
