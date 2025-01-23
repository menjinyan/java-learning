package com.yanjinmen.test;

/*1. 使用其他类时，不需导包
2. 使用Java。lang包中的类时，不需要导包
3. 其他情况都需要导包
4. 如果同时使用两个包中的同类名，需要用全类名*/

public class Student {
   private String name;
   private int age;

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
