package com.hades.example.designpatterns.proxy._3_protection_proxy_4_dating_system;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {
    PersonBean mPersonBean;

    public OwnerInvocationHandler(PersonBean personBean) {
        mPersonBean = personBean;
    }

    /**
     * Example: ownerProxy.setInterests("Walking,yoga");
     * @param proxy  "null"
     * @param method "public abstract void com.hades.example.designpatterns.proxy._3_protection_proxy_4_dating_system.PersonBean.setInterests(java.lang.String)"
     * @param args   Object[1]472
     *               0 = "Walking,yoga"
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(mPersonBean, args);
            } else if (method.getName().startsWith("setHotOrNotRating")) {
                throw new IllegalAccessException();
            } else if (method.getName().startsWith("set")) {
                return method.invoke(mPersonBean, args);
            }
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
