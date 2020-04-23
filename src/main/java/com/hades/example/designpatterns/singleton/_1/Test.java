package com.hades.example.designpatterns.singleton._1;

public class Test {
    public static void main(String[] args){
        Singleton singleton = Singleton.getInstance();
        singleton.increment();

        Singleton singleton2 = Singleton.getInstance();
        singleton2.increment();
    }
}
