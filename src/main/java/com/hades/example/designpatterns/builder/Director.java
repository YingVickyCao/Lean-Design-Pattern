package com.hades.example.designpatterns.builder;

public class Director {
    public static void main(String[] args) {
        test(new HPPCBuilder(), "HP PC");
        System.out.println();

        test(new DellPCBuilder(), "Dell PC");
    }

    private static void test(PCBuilder builder, String name) {
        builder.setName(name).addMaster().addScreen().addKeyboard().addMouse();
        PC pc = builder.build();
        pc.create();
        System.out.println(pc.toString());
    }
}
