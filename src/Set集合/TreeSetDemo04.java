package src.Set集合;

import java.util.TreeSet;

public class TreeSetDemo04 {
    public static void main(String[] args) {
        /**
         * 需求：创建5个学生对象
         * 属性：（姓名，年龄，语文成绩，数学成绩，英语成绩），
         * 按照总分从高到低输出到控制台
         * 如果总分一样，按照语文成绩排
         * 如果语文一样，按照数学成绩排
         * 如果数学成绩一样，按照英语成绩排
         * 如果英文成绩一样，按照年龄排
         * 如果年龄一样，按照姓名的字母顺序排
         * 如果都一样，认为是同一个学生，不存。
         */

        //创建学生对象
        Student2 s = new Student2("zhangsan", 23, 90, 99, 50);
        Student2 s1 = new Student2("lisi", 21, 99, 100, 50);
        Student2 s2 = new Student2("wangwu", 24, 90, 90, 60);


        //创建集合
        //默认ArrayList
        TreeSet<Student2> set = new TreeSet<>();

        //添加元素
        set.add(s);
        set.add(s1);
        set.add(s2);

        //打印集合
        System.out.println(set);

        //遍历集合
        for (Student2 student2 : set) {
            System.out.println(student2);
        }

    }
}
