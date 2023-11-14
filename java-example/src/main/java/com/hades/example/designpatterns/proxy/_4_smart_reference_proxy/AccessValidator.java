package com.hades.example.designpatterns.proxy._4_smart_reference_proxy;

public class AccessValidator {
    public static boolean validate(String user) {
        return "admin".equals(user);
    }
}
