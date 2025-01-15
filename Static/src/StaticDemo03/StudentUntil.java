package StaticDemo03;

import StaticDemo01.StudentTest;

import java.util.ArrayList;

public class StudentUntil {
    private StudentUntil() {
    }

    //静态方法
    public static int getMaxStudent(ArrayList<Student> list) {
        //1、定义一个参照物
        int max = list.get(0).getAge();

        //2、循环遍历集合
        for (int i = 1; i < list.size(); i++) { //为了提高代码的效率最好是从1开始循环
            //i表示的是集合里面的索引 list.get(i)表示的是集合里面的每一个元素也就是学生对象，同时我们还需要getAge获取到年龄之后在进行比较
            int tempAge = list.get(i).getAge(); //用一个临时的变量去进行记录
            if (tempAge > max) {
                max = tempAge;
            }
        }
        //3、当循环结束之后直接返回一个max
        return max;
    }
}

