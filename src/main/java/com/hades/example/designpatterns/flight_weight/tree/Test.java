package com.hades.example.designpatterns.flight_weight.tree;

public class Test {
    public static void main(String[] args) {
        int[][] deciduousLocations = {{1, 1}, {33, 50}, {100, 90}};
        int[][] coniferLocations = {{10, 87}, {24, 76}, {2, 64}};

        TreeFactory treeFactory = new TreeFactory();
        Tree deciduousTree;
        Tree coniferTree;

        try {
            deciduousTree = treeFactory.getTree("deciduous");
            coniferTree = treeFactory.getTree("conifer");

            for (int[] location : deciduousLocations) {
                deciduousTree.display(location[0], location[1]);
            }

            for (int[] location : coniferLocations) {
                coniferTree.display(location[0], location[1]);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
