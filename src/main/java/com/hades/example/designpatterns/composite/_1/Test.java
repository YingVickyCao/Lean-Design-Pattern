package com.hades.example.designpatterns.composite._1;

import java.util.ArrayList;
import java.util.List;

/**
 * Before = Iterator Pattern - after_4
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.testPrintMenus();

//        test.external_iterator();
//        System.out.println();

//        test.internal_iterator();
    }

    private void testPrintMenus() {
        MenuComponent pancakeHouseIMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinnerMenu = new Menu("DINNER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Cafe");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeHouseIMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseIMenu.add(new MenuItem("Breakfast 1", "Breakfast 1 desc", false, 4));
        pancakeHouseIMenu.add(new MenuItem("Breakfast 2", "Breakfast 2 desc", true, 5));

        dinnerMenu.add(new MenuItem("Lunch 1", "Lunch 1 desc", true, 3));
        dinnerMenu.add(new MenuItem("Lunch 2", "Lunch 2 desc", true, 4));
        dinnerMenu.add(dessertMenu);

        cafeMenu.add(new MenuItem("Cafe 1", "Cafe 1 desc", true, 5));
        cafeMenu.add(new MenuItem("Cafe 2", "Cafe 2 desc", true, 5));

        dessertMenu.add(new MenuItem("Dessert 1", "Dessert 1 desc", false, 8));
        dessertMenu.add(new MenuItem("Dessert 2", "Dessert 2 desc", true, 8));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

        waitress.printBreakfastMenu();

        waitress.printLunchMenu();

        waitress.printVegetarianMenu();
//
        System.out.println(waitress.isItemVegetarian("Dessert 1"));     // false
        System.out.println(waitress.isItemVegetarian("Breakfast 2"));   // true
        System.out.println(waitress.isItemVegetarian("DINNER MENU"));   // false
    }

    // 外部迭代器
    private void external_iterator() {
        List<String> words = new ArrayList<>();
        words.add("A");
        words.add("B");
        words.add("C");

        // for ,foreach, while
        for (String item : words) {
            System.out.println(item);
        }

//        Iterator<String> iterator =  words.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
    }

    // 内部迭代器
    private void internal_iterator() {
        List<String> words = new ArrayList<>();
        words.add("A");
        words.add("B");
        words.add("C");

        words.forEach(e -> System.out.println(e));
    }
}
