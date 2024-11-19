package src.集合;

import java.util.ArrayList;

public class Test03添加学生对象并遍历 {
    public static void main(String[] args) {
        //需求:
        //定义一个集合，添加学生对象，并进行遍历
        //学生类的属性为:姓名，年龄

        //1、创建集合
        ArrayList<Student> list = new ArrayList<>();

        //2、创建学生对象
        Student s1 = new Student(24, "zhangshan");
        Student s2 = new Student(23, "wangwu");
        Student s3 = new Student(22, "lisi");

        //3、添加元素
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //4、遍历集合
        for (int i = 0; i < list.size(); i++) {
            //i索引 list.get(i) 这个就是元素1也就是我们添加的学生对象
            Student stu = list.get(i);
            System.out.println(stu.getName()+","+stu.getAge());
        }
    }
}
