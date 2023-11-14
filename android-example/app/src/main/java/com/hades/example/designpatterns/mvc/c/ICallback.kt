package com.hades.example.designpatterns.mvc.c

import com.hades.example.designpatterns.mvc.m.LoginResponseBean

interface ICallback {
    fun onSuccess(responseBean: LoginResponseBean);
    fun onError(errorCode: Int, error: String)
}