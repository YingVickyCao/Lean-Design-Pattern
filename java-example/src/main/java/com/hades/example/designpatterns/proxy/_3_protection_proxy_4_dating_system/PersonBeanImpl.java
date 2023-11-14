package com.hades.example.designpatterns.proxy._3_protection_proxy_4_dating_system;

public class PersonBeanImpl implements PersonBean {
    private String name;
    private String gender;
    private String interests;
    private int rating;
    private int ratingCount;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getHotOrNotRating() {
        return 0 == ratingCount ? 0 : rating / ratingCount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.rating += rating;
        ratingCount++;  //增加计数
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", interests='" + interests + '\'' +
                ", rating=" + rating +
                ", ratingCount=" + ratingCount +
                '}';
    }
}
