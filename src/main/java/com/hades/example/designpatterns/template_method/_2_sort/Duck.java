package com.hades.example.designpatterns.template_method._2_sort;

public class Duck implements Comparable {
    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Duck) {
            Duck duck = (Duck) o;
            return Integer.compare(this.weight, duck.getWeight());
        }
        return 1;
    }

    @Override
    public String toString() {
        return name + " weight is " + weight;
    }
}
