package com.hades.example.designpatterns.mvp.m

class LoginResponseBean(val isSuccess: Boolean, val errorCode: String) {
    var menus: List<String>? = null;
    override fun toString(): String {
        return "LoginResponseBean(isSuccess=$isSuccess, errorCode='$errorCode', menus=$menus)"
    }
}