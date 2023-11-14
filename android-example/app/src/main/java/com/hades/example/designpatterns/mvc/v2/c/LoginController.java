package com.hades.example.designpatterns.mvc.v2.c;

import androidx.annotation.NonNull;

import com.hades.example.designpatterns.mvc.v2.LoginContract;

import java.util.List;

public class LoginController implements LoginContract.IController {
    LoginContract.IModel mModel;

    public LoginController(LoginContract.IModel mModel) {
        this.mModel = mModel;
    }

    @Override
    public void onLoginBtnClick(@NonNull String userId, @NonNull String userPwd) {
        mModel.login(userId, userPwd);
    }

    @Override
    public boolean isValidUserId(String userId) {
        return null != userId && !userId.isEmpty();
    }

    @Override
    public boolean isValidUserPwd(String userId) {
        return null != userId && !userId.isEmpty();
    }

    @Override
    public String convertLoginMenus(List<String> menus) {
        if (null == menus || menus.isEmpty()) {
            return null;
        }
        StringBuilder result = new StringBuilder();
        for (String menu : menus) {
            result.append(menu).append("\n");
        }
        return result.toString();
    }
}
