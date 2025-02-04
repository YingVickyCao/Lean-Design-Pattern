package com.hades.example.designpatterns.pattern.mvc.v1.m;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import com.hades.example.designpatterns.pattern.mvc.v1.LoginContract;
import com.hades.example.designpatterns.pattern.mvc.v1.c.ICallback;
import com.hades.example.designpatterns.pattern.mvc.v1.LoginContract;

import java.util.ArrayList;
import java.util.List;

/**
 * LoginModel 捕获用户输入，并校验输入的user id是否合法
 */

public class LoginModel implements LoginContract.IModel {
    private static final String TAG = "LoginModel";

    @Override
    public void login(@Nullable String userId, @Nullable String userPwd, @NonNull ICallback callback) {
//        mockLoginRequestSuccess(userId, userPwd, callback);
        mockLoginRequestFailed(userId, userPwd, callback);
    }

    private void mockLoginRequestSuccess(@Nullable String userId, @Nullable String userPwd, @NonNull ICallback callback) {
        new Thread(() -> {
            try {
                Log.d(TAG, "login ---> :userId=" + userId);
                Thread.sleep(5000);
                LoginResponseBean responseBean = new LoginResponseBean(true, "");
                List<String> menus = new ArrayList<>();
                menus.add("Video");
                menus.add("News");
                responseBean.setMenus(menus);
                Log.d(TAG, "login success :" + responseBean);
                Log.d(TAG, "login <-- ");
                callback.onSuccess(responseBean);
            } catch (InterruptedException ex) {
                Log.d(TAG, "login error:" + ex.getMessage());
                Log.d(TAG, "login <-- ");
                callback.onError(2, ex.getMessage());
            }
        }).start();
    }

    private void mockLoginRequestFailed(@Nullable String userId, @Nullable String userPwd, @NonNull ICallback callback) {
        new Thread(() -> {
            try {
                Log.d(TAG, "login ---> :userId=" + userId);
                Thread.sleep(5000);
                Log.d(TAG, "login error :");
                Log.d(TAG, "login <-- ");
                callback.onError(2, "login time out");
            } catch (InterruptedException ex) {
                Log.d(TAG, "login error:" + ex.getMessage());
                Log.d(TAG, "login <-- ");
                callback.onError(2, ex.getMessage());
            }
        }).start();
    }
}
