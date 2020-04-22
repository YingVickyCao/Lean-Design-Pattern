package com.hades.example.designpatterns.factory._4_abstract_factory.pizzza;

import com.hades.example.designpatterns.factory._4_abstract_factory.pizzaIngred.*;

public abstract class Pizza {
    protected String name;
    Dough mDough;
    Sauce mSauce;
    Veggie[] mVeggies;
    Cheese mCheese;
    Pepperoni mPepperoni;
    Clams mClams;

    /**
     * 准备
     */
    public abstract void prepare();

    /**
     * 烘烤
     */
    public void bake() {
//        System.out.println("prepare");
    }

    /**
     * 切片
     */
    public void cut() {
//        System.out.println("cut");
    }

    /**
     * 装盒
     */
    public void box() {
//        System.out.println("box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("---- " + name + " ----\n");
        if (mDough != null) {
            result.append(mDough);
            result.append("\n");
        }
        if (mSauce != null) {
            result.append(mSauce);
            result.append("\n");
        }
        if (mCheese != null) {
            result.append(mCheese);
            result.append("\n");
        }
        if (mVeggies != null) {
            for (int i = 0; i < mVeggies.length; i++) {
                result.append(mVeggies[i]);
                if (i < mVeggies.length - 1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        if (mClams != null) {
            result.append(mClams);
            result.append("\n");
        }
        if (mPepperoni != null) {
            result.append(mPepperoni);
            result.append("\n");
        }
        return result.toString();
    }
}
