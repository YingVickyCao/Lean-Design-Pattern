package com.hades.example.designpatterns.pattern.mvc.v2.c

import com.hades.example.designpatterns.pattern.mvc.v2.m.LoginResponseBean

interface ICallback {
    fun onSuccess(responseBean: LoginResponseBean);
    fun onError(errorCode: Int, error: String)
}