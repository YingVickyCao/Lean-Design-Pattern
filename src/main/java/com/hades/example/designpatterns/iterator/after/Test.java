package com.hades.example.designpatterns.iterator.after;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.testPrintMenus();
    }

    private void testPrintMenus() {
        PrintCustomizeMenu print = new PrintCustomizeMenu();
        print.printMenu();
        System.out.println();

        print.printBreakfastMenu();
        System.out.println();

        print.printLunchMenu();
        System.out.println();

        print.printVegetarianMenu();
        System.out.println();

        System.out.println(print.isItemVegetarian("A"));
        System.out.println(print.isItemVegetarian("Vegetarian BLT"));
    }
}
