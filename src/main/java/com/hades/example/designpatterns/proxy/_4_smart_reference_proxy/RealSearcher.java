package com.hades.example.designpatterns.proxy._4_smart_reference_proxy;

public class RealSearcher implements Searcher {
    @Override
    public String search(String value) {
        // mock
        String result = "sample result of " + value;
        return result;
    }
}
