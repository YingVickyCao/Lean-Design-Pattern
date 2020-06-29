package com.hades.example.designpatterns.flight_weight.tree;

import java.util.HashMap;

public class TreeFactory {
//    private Tree deciduousTree;
//    private Tree coniferTree;

    private static final HashMap<String, Tree> treeMap = new HashMap<>();

    public TreeFactory() {
//        deciduousTree = new DeciduousTree();
//        coniferTree = new ConiferTree();
    }

//    public Tree getTree(String type) throws Exception {
//        if ("deciduous".equalsIgnoreCase(type)) {
//            return deciduousTree;
//        } else if ("conifer".equalsIgnoreCase(type)) {
//            return coniferTree;
//        } else {
//            throw new Exception("Invalid kind of tree");
//        }
//    }

    public Tree getTree(String type) throws Exception {
        if ("deciduous".equalsIgnoreCase(type)) {
            return getDeciduousTree();
        } else if ("conifer".equalsIgnoreCase(type)) {
            return getConiferTree();
        } else {
            throw new Exception("Invalid kind of tree");
        }
    }

    public static Tree getDeciduousTree() {
        Tree tree = treeMap.get(DeciduousTree.class.getSimpleName());

        if (tree == null) {
            tree = new DeciduousTree();
            System.out.println("Creating DeciduousTree");
        }
        return tree;
    }

    public static Tree getConiferTree() {
        Tree tree = treeMap.get(ConiferTree.class.getSimpleName());

        if (tree == null) {
            tree = new ConiferTree();
            System.out.println("Creating ConiferTree : ");
        }
        return tree;
    }
}
