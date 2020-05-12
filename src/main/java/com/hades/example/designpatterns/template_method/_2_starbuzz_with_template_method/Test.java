package com.hades.example.designpatterns.template_method._2_starbuzz_with_template_method;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.brewCoffee();
        System.out.println();
        
        test.makeTea();
    }

    private void brewCoffee() {
        CaffeineBeverage coffee = new Coffee();
        System.out.println("Coffee:");
        coffee.prepareRecipe();
    }

    private void makeTea(){
        System.out.println("Tea:");
        CaffeineBeverage tea= new Tea();
        tea.prepareRecipe();
    }
}