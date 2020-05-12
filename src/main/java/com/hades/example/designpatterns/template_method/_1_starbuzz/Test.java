package com.hades.example.designpatterns.template_method._1_starbuzz;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.brewCoffee();
        System.out.println();

        test.makeTea();
    }

    private void brewCoffee() {
        Coffee coffee = new Coffee();
        System.out.println("Coffee:");
        coffee.prepareRecipe();
    }

    private void makeTea(){
        System.out.println("Tea:");
        Tea tea= new Tea();
        tea.prepareRecipe();
    }
}