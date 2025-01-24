package src.Static.StaticDemo03;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Test {
    public static void main(String[] agrs) {
        //1、创建一个集合用来存储学生对象
        ArrayList<Student> list = new ArrayList<>();

        //2、创建三个学生对象、
        Student s1 = new Student(23, "男", "zhangsan");
        Student s2 = new Student(18, "女", "lis");
        Student s3 = new Student(22, "男", "wangwu");

        //3、把学生对象添加到集合当中
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //4、调用工具类中的方法
        int maxAgeStudent = StudentUntil.getMaxStudent(list);
        System.out.println(maxAgeStudent);
    }
}


