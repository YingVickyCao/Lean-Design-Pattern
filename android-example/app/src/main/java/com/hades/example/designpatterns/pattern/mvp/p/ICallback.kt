package com.hades.example.designpatterns.pattern.mvp.p

import com.hades.example.designpatterns.pattern.mvp.m.LoginResponseBean

interface ICallback {
    fun onSuccess(responseBean: LoginResponseBean);
    fun onError(errorCode: Int, error: String)
}