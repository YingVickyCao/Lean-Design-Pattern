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

            displayTrees(deciduousTree, deciduousLocations);
            displayTrees(coniferTree, coniferLocations);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void displayTrees(Tree tree, int[][] locations) {
        try {
            for (int[] location : locations) {
                tree.display(location[0], location[1]);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
