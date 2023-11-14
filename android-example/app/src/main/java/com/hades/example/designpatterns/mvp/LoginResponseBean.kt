package com.hades.example.designpatterns.mvp

class LoginResponseBean(val isSuccess: Boolean, val errorCode: String) {
    var menus: List<String>? = null;
}