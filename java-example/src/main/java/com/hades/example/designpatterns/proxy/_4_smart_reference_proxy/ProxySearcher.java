package com.hades.example.designpatterns.proxy._4_smart_reference_proxy;

public class ProxySearcher implements Searcher {
    private Searcher searcher;
    private String user;

    public ProxySearcher(String user) {
        this.user = user;
        this.searcher = new RealSearcher();
    }

    @Override
    public String search(String value) {
//        if (AccessValidator.validate(user)) {
//            String result = searcher.search(value);
//            UsageLogger.log(user , value);
//            return result;
//        }
//        return null;

        String result = searcher.search(value);
        UsageLogger.log(user, value);
        return result;
    }
}
