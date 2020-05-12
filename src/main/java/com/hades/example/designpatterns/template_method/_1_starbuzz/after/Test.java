package com.hades.example.designpatterns.template_method._1_starbuzz.after;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.brewCoffee();
        System.out.println();

        test.brewCoffee2();
        System.out.println();

        test.makeTea();
    }

    private void brewCoffee() {
        CaffeineBeverage coffee = new Coffee();
        System.out.println("Coffee:");
        coffee.prepareRecipe();
    }

    private void brewCoffee2() {
        CaffeineBeverageWithHook coffee = new CoffeeWithHook();
        System.out.println("Coffee:");
        coffee.prepareRecipe();
    }

    private void makeTea(){
        System.out.println("Tea:");
        CaffeineBeverage tea= new Tea();
        tea.prepareRecipe();
    }
}