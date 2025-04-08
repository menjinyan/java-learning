package src.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class 对方法4进行展开 {
    public static void main(String[] args) {
        //1、创建集合的对象
        Collection<Student> collection = new ArrayList();

        //2、创建三个学生对象
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 25);
        Student s3 = new Student("wangwu", 21);

        //3、把学生对象添加到集合当中
        collection.add(s1);
        collection.add(s2);
        collection.add(s3);

        //4、判断集合当中某一个学生对象是否包含
        Student s4 = new Student("zhangsan", 23);
        //如果同姓名同年龄，就认为是同一个学生
        //因为contains方法在底层依赖equals方法判断对象是否一致的
        //如果存的是自定义对象，没有重写equals方法，那么默认的使用就是Object类中的equals方法进行判断
        //而Object中的方法是依赖地址值进行判断的
        //需求:如果同姓和同年龄，就认为是同一个学生
        //所以需要在自定义的javabean类中，重写equals方法就可以了
        System.out.println(collection.contains(s4));
    }
}
