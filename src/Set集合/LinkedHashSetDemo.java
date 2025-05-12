package src.Set集合;

import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //创建4个学生对象
        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("lisi", 19);
        Student s3 = new Student("wangwu", 20);
        Student s4 = new Student("zhangsan", 18);

        //创建集合的对象
        LinkedHashSet<Student> set = new LinkedHashSet<Student>();

        //添加元素
        System.out.println(set.add(s1));
        System.out.println(set.add(s2));
        System.out.println(set.add(s3));
        System.out.println(set.add(s4));

        //打印集合
        System.out.println(set);
    }
}
