package com.hades.example.designpatterns.pattern.mvc.v2

import com.hades.example.designpatterns.pattern.mvc.v2.c.ICallback

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
        fun onLoginBtnClick(userId: String, userPwd: String)
        fun isValidUserId(userId: String?): Boolean
        fun isValidUserPwd(userId: String?): Boolean
        fun convertLoginMenus(menus: List<String>): String
    }

    interface IModel {
        fun setCallback(callback: ICallback)
        fun login(userId: String?, userPwd: String?, callback: ICallback)
        fun login(userId: String?, userPwd: String)
        fun setMenus(menus: String);
    }
}