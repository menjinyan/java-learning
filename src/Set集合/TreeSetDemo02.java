package src.Set集合;

import java.util.TreeSet;

public class TreeSetDemo02 {
    public static void main(String[] args) {
        /**
         * 需求：创建TreeSet集合，并添加3个学生对象
         * 学生对象属性：
         * 姓名，年龄。
         * 要求按照学生的年龄进行排序
         * 同年龄按照姓名字母排列（暂不考虑中文）
         * 同姓名，同年龄认为是同一个人
         *
         * 两种比较方式
         * 方式一：
         * 默认的排序规则/自然排序
         * Student实现Comparable接口，重写里面的抽象方法，再指定比较规则
         */

        //1、创建三个学生对象
        Tstudent2 s1 = new Tstudent2("zhangsan", 32);
        Tstudent2 s2 = new Tstudent2("lisi", 23);
        Tstudent2 s3 = new Tstudent2("wangwu", 22);

        //2、创建集合对象
        TreeSet<Tstudent2> set = new TreeSet<>();

        //3、添加元素
        set.add(s1);
        set.add(s2);
        set.add(s3);

        //4、打印集合
        System.out.println(set);
    }
}
