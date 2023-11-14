package com.hades.example.designpatterns.mvp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * LoginModel 捕获用户输入，并校验输入的user id是否合法
 */

public class LoginModel implements LoginContract.IModel {
    User user = new User();

    @Override
    public void login(@Nullable String userId, @Nullable String userPwd, @NonNull ICallback callback) {
        new Thread(() -> {
            try {
                Thread.sleep(5000);
                LoginResponseBean responseBean = new LoginResponseBean(true, "");
                List<String> menus = new ArrayList<>();
                menus.add("Video");
                menus.add("News");
                responseBean.setMenus(menus);
                callback.onSuccess(responseBean);
            } catch (InterruptedException e) {
                callback.onError(2, e.getMessage());
            }
        }).start();
    }
}
