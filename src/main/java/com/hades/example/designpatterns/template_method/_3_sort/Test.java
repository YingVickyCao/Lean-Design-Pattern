package com.hades.example.designpatterns.template_method._3_sort;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Duck[] ducks = {new Duck("Duck1", 1), new Duck("Duck2", 10), new Duck("Duck3", 8)};
        System.out.println(Arrays.toString(ducks));

        Arrays.sort(ducks);
        System.out.println(Arrays.toString(ducks));

        int[] ints = {1, 10, 8};
        System.out.println(Arrays.toString(ints));
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
    }
}
