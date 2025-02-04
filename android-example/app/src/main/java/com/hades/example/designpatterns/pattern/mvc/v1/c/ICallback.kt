package com.hades.example.designpatterns.pattern.mvc.v1.c

import com.hades.example.designpatterns.pattern.mvc.v1.m.LoginResponseBean

interface ICallback {
    fun onSuccess(responseBean: LoginResponseBean);
    fun onError(errorCode: Int, error: String)
}