package src.集合;

import java.util.ArrayList;
import java.util.Scanner;

public class Test04添加学生对象并遍历 {
    public static void main(String[] args) {
        //需求:
        //定义一个集合，添加学生对象，并进行遍历
        //学生类的属性为:姓名，年龄
        //要求:对象的数据来自键盘录入

        //1、创建集合
        ArrayList<Student> list = new ArrayList<>();

        //2、键盘录入学生的信息,并添加到集合当中
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s = new Student();
            System.out.println("请输入学生的姓名");
            String name = sc.next();
            System.out.println("请输入学生的年龄");
            int age = sc.nextInt();

            //3、把nmae和age赋值给学生对象
            s.setName(name);
            s.setAge(age);

            //4、把学生对象添加到集合当中
            list.add(s);
        }
        //5、遍历
        for (int i = 0; i < list.size(); i++) {
            //i表示索引 list.get(i)表示元素和对象
            Student s = list.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
