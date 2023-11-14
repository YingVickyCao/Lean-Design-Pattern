package com.hades.example.designpatterns.flight_weight.tree;

import java.time.LocalDate;

public class DeciduousTree implements Tree {

    @Override
    public void display(int x, int y) {
        if (isWithinRange(LocalDate.now())) {
            System.out.println("Deciduous tree is located at " + x + ", " + y);
        } else {
            System.out.println("Deciduous tree is located at " + x + ", " + y + ", and current has no leaves");
        }
    }
}
