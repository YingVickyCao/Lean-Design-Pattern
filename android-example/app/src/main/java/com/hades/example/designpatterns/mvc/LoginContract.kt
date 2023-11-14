package com.hades.example.designpatterns.mvc

import com.hades.example.designpatterns.mvc.c.ICallback

interface LoginContract {
    interface IView {
        fun showLoading()
        fun hideLoading()
        fun setUserIdError(errorCode: Int, errorMessage: String)
        fun setUserPwdError(errorCode: Int, errorMessage: String)
        fun loginSuccess(menus: String)
        fun loginFailure(errorCode: Int, errorMessage: String)
    }

    interface IController {
        fun onLoginBtnClick(userId: String, userPwd: String);
    }

    interface IModel {
        fun login(userId: String?, userPwd: String?, callback: ICallback)
    }
}