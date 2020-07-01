package com.hades.example.designpatterns.prototype.deep_clone._2;

import java.io.*;

public abstract class Dog implements Serializable {
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

    public abstract Dog copy() throws IOException, ClassNotFoundException;

    /**
     * Deep Clone -  Way 2: Use Serializable to read byte stream
     */
    public Dog deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (Dog) ois.readObject();
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
