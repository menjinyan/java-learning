package src.Set集合;

import java.util.HashSet;

public class HashSetDemo02 {
    public static void main(String[] args) {
        /**
         * 需求：创建一个存储学生对象的集合，存储多个学生对象。
         * 使用程序实现在控制台遍历该集合。
         * 要求：学生对象的成员变量值相同，我们就认为是同一个对象
         */

        //1、创建三个学生对象
        Student s1 = new Student("lisi", 20);
        Student s2 = new Student("wangwu", 21);
        Student s3 = new Student("zhangsan", 22);
        Student s4 = new Student("zhangsan", 22);

        //2、创建集合用来添加学生
        HashSet<Student> hs = new HashSet<>();

        //3、添加学生
        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4));

        //4、打印集合
        System.out.println(hs);
    }
}
