package com.hades.example.designpatterns.proxy._3_protection_proxy_4_dating_system;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class MatchMarking {
    private Map<String, PersonBean> datingDB = new HashMap<String, PersonBean>();

    public MatchMarking() {
        initDataBase();
    }

    public void drive() {
        PersonBean p1 = getPersonFromDatabase("Person 1");
        System.out.println(Proxy.isProxyClass(p1.getClass()));  // false

        // OwnerInvocationHandler
        PersonBean ownerProxy = getOwnerProxy(p1);
        System.out.println(Proxy.isProxyClass(ownerProxy.getClass()));  // true
        System.out.println(p1.toString());
        ownerProxy.setInterests("Walking,yoga");
        System.out.println("interests : " + ownerProxy.getInterests());
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception ex) {
            System.out.println("Can set rating from owner proxy");
        }
        System.out.println(p1.toString());
        System.out.println();

        // NonOwnerInvocationHandler
        PersonBean nonOwnerProxy = getNonOwnerProxy(p1);
        System.out.println(p1.toString());
        try {
            nonOwnerProxy.setInterests("Running");
        } catch (Exception ex) {
            System.out.println("Can set interests from non owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println(nonOwnerProxy.toString()); // null
        System.out.println("rating:" + nonOwnerProxy.getHotOrNotRating()); // null
        System.out.println(p1.toString());
    }

    /**
     * @param bean Subject.  参数bean是Subject
     * @return Proxy. 返回 参数bean的代理。因为代理和主题具有相同的主题，所以返回一个PersonBean
     */
    private PersonBean getOwnerProxy(PersonBean bean) {
        // Create dynamic proxy instance
        /**
         * bean.getClass().getInterfaces()：代理需要实现的接口
         * new OwnerInvocationHandler(bean)：调用处理器。此处是OwnerInvocationHandler
         */
        return (PersonBean) Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), new OwnerInvocationHandler(bean));
    }

    private PersonBean getNonOwnerProxy(PersonBean bean) {
        // Create dynamic proxy instance
        return (PersonBean) Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), new NonOwnerInvocationHandler(bean));
    }

    private PersonBean getPersonFromDatabase(String name) {
        return datingDB.get(name);
    }

    private void initDataBase() {
        PersonBean p1 = new PersonBeanImpl();
        p1.setName("Person 1");
        p1.setGender("Female");
        p1.setInterests("Music,Compute");
        p1.setHotOrNotRating(7);
        datingDB.put(p1.getName(), p1);

        PersonBean p2 = new PersonBeanImpl();
        p2.setName("Person 2");
        p2.setGender("Male");
        p2.setInterests("Game");
        p2.setHotOrNotRating(7);
        datingDB.put(p2.getName(), p2);
    }
}