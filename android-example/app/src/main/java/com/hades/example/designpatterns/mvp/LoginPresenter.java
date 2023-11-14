package com.hades.example.designpatterns.mvp;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class LoginPresenter implements LoginContract.IPresenter {

    LoginContract.IView mView;
    LoginContract.IModel mModel;

    public LoginPresenter(LoginContract.IView mView, LoginContract.IModel mModel) {
        this.mView = mView;
        this.mModel = mModel;
    }

    @Override
    public void onLoginBtnClick(@NonNull String userId, @NonNull String userPwd) {
        if (!isValidUserId(userId)) {
            mView.setUserIdError(1, "user id is empty");
            return;
        }
        if (!isValidUserPwd(userId)) {
            mView.setUserPwdError(2, "user password is empty");
            return;
        }
        mView.showLoading();
        mModel.login(userId, userPwd, new ICallback() {
            @Override
            public void onSuccess(@NonNull LoginResponseBean responseBean) {
                mView.hideLoading();
                if (!responseBean.isSuccess()) {
                    mView.loginFailure(0, "login response data is invalid");
                    return;
                }
                String menus = convertLoginMenus(responseBean.getMenus());
                mView.loginSuccess(menus);
            }

            @Override
            public void onError(@NotNull int errorCode, @NotNull String error) {
                mView.hideLoading();
                mView.loginFailure(errorCode, error);
            }
        });
    }

    private boolean isValidUserId(String userId) {
        return null != userId && !userId.isEmpty();
    }

    private boolean isValidUserPwd(String userId) {
        return null != userId && !userId.isEmpty();
    }

    private String convertLoginMenus(List<String> menus) {
        if (null == menus || menus.isEmpty()) {
            return null;
        }
        return menus.toString();
    }
}
