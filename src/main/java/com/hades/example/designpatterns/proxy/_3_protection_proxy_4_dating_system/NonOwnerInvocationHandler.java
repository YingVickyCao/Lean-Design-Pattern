package com.hades.example.designpatterns.proxy._3_protection_proxy_4_dating_system;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {
    private PersonBean mPersonBean;

    public NonOwnerInvocationHandler(PersonBean personBean) {
        mPersonBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(mPersonBean, args);
            } else if (method.getName().startsWith("setHotOrNotRating")) {
                return method.invoke(mPersonBean, args);
            } else if (method.getName().startsWith("set")) {
                throw new IllegalAccessException();
            }
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
