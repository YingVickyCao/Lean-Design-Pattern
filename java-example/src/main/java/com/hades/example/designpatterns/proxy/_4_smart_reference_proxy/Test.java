package com.hades.example.designpatterns.proxy._4_smart_reference_proxy;

public class Test {
    public static void main(String[] args) {
        String result;
        Searcher searcher;

        final String USER_ANONYMOUS = "anonymous";
        final String USER_ADMIN = "admin";
        final String USER_USER1 = "user1";

        final String VALUE_1 = "abc";
        final String VALUE_2 = "xyz";

        //未授权访问
        searcher = new ProxySearcher(USER_ANONYMOUS);
        result = searcher.search(VALUE_1);
        System.out.println("result:" + result);
        System.out.println();

        //授权访问
        searcher = new ProxySearcher(USER_ADMIN);
        result = searcher.search(VALUE_2);
        System.out.println("result:" + result);
        System.out.println();

        searcher = new ProxySearcher(USER_USER1);
        result = searcher.search(VALUE_1);
        System.out.println("result:" + result);
        System.out.println();

        int count = UsageLogger.countSearchValue(VALUE_1);
        System.out.println(VALUE_1 + " has searched " + count + " times");
    }
}