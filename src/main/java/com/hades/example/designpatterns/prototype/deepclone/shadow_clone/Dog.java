package com.hades.example.designpatterns.prototype.deepclone.shadow_clone;

public abstract class Dog implements Cloneable {
    protected String name;
    protected int age;
    protected String food;
    // Reference type is Shallow Clone when Dog is Cloneable
    protected ParamBean mParamBean;

    public Dog(String name) {
        this.name = name;
        mParamBean = new ParamBean();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void jump() {
        // Default is do nothing
    }

    public abstract Dog copy() throws CloneNotSupportedException;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", food='" + food + '\'' +
                ", ParamBean@'" + mParamBean.hashCode() + '\'' +
                '}';
    }
}
