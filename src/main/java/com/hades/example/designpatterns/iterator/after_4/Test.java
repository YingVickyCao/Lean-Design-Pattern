package com.hades.example.designpatterns.iterator.after_4;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.testPrintMenus();

//        test.external_iterator();
//        System.out.println();

//        test.internal_iterator();
    }

    private void testPrintMenus() {
        {
            List<Menu> menuList = new ArrayList<>();
            menuList.add(new PancakeHouseMenu());
            menuList.add(new DinnerMenu());
            menuList.add(new CafeMenu());

            Waitress print = new Waitress(menuList);

            print.printMenu();
            System.out.println();

            print.printVegetarianMenu();
            System.out.println();

            System.out.println(print.isItemVegetarian("A"));
            System.out.println(print.isItemVegetarian("Vegetarian BLT"));
        }

        {
            Waitress print = new Waitress(new PancakeHouseMenu(), new DinnerMenu(), new CafeMenu());
            print.printBreakfastMenu();
            System.out.println();

            print.printLunchMenu();
            System.out.println();
        }

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
