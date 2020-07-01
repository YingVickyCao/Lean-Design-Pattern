package com.hades.example.designpatterns.prototype.deep_clone;

public abstract class Dog implements Cloneable {
    protected String name;
    protected int age;
    protected String food;
    // Reference type is Shallow Clone when Dog is Cloneable
    protected ParamBean mParamBean;

    public Dog(String name) {
        this.name = name;
        mParamBean = new ParamBean("");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void jump() {
        // Default is do nothing
    }

    public abstract Dog copy() throws CloneNotSupportedException;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ParamBean paramBean = (ParamBean) mParamBean.clone();//对其引用变量进行拷贝
        Dog dog = (Dog) super.clone();//自身拷贝
        dog.mParamBean = paramBean;//引用变量重新赋值。
        return dog;
    }

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
