package com.tuhj.entities;

/**
 * @Author ：Created by tuhj
 * @Date ：Created in 2018-11-15 17:44
 * @Description ：
 * @Modified ：
 */
public class Dog {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
