package com.yanjinmen.test;

/*1. 使用其他类时，不需导包
2. 使用Java。lang包中的类时，不需要导包
3. 其他情况都需要导包
4. 如果同时使用两个包中的同类名，需要用全类名*/

import com.yanjinmen.domain1.Teacher;

public class Test {
    public static void main(String[] args) {
        //创建的对象
        //结论1
        /*Student s = new Student();
        s.setName("张三");
        s.setAge(23);
        System.out.println(s.getName() + "," + s.getAge());*/

        //结论2
        /*String s ="abc";
        System.out.println(s);*/

        //结论3and4
        com.yanjinmen.domain1. Teacher t = new com.yanjinmen.domain1.Teacher();
        com.yanjinmen.domain2.Teacher t1 = new com.yanjinmen.domain2.Teacher();
    }
}
