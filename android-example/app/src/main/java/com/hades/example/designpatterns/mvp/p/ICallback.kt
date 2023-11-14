package com.hades.example.designpatterns.mvp.p

import com.hades.example.designpatterns.mvp.m.LoginResponseBean

interface ICallback {
    fun onSuccess(responseBean: LoginResponseBean);
    fun onError(errorCode: Int, error: String)
}