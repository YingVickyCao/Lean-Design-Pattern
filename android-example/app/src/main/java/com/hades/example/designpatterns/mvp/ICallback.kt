package com.hades.example.designpatterns.mvp

interface ICallback {
    fun onSuccess(responseBean: LoginResponseBean);
    fun onError(errorCode: Int, error: String)
}