package src.Generics;

import java.util.ArrayList;

public class Demo06 {
    public static void main(String[] args) {
        /**
         *需求:
         * 定义一个方法，形参是一个集合，但是集合中的数据类型不确定
         */

        //  创建集合的对象
        ArrayList<Ye1> list1 = new ArrayList<>();
        ArrayList<Fu1> list2 = new ArrayList<>();
        ArrayList<Zi1> list3 = new ArrayList<>();
        ArrayList<Student> list4 = new ArrayList<>();

        //method(list1);
        method(list2);
        //method(list3);
        //method(list4);
    }

    /**
     * 泛型不具备继承性，但是数据具备继承性
     */

    /**
     * 此时泛型中写的是什么类型，那么只能传递什么类型的数值
     *
     * 弊端:
     * 利用泛型方由有一个小弊端，此时他可以接受任意的数据类型
     *
     *希望:
     * 本方法虽然不确定类型，但是以后我希望只能传播Ye1 Fu1 Zi1 Student2
     *
     * 此时我们就可以使用泛型的通配符:
     * ？表示不确定的类型
     * 他可以进行类型的限定
     * ? entends E:表示么可以传播E或者E所有的子类类型
     * ? super E:表示可以传播E或者E所有的父类类型
     *
     * 应用场景:
     * 1、如果我们在定义类，方法，接口的时候，如果类型不确定，就可以定义类和泛型
     * 2、如果我们不确定，但是知道以后只能传播某个继承体系中的，就可以使用泛型的通配符
     *
     * 泛型的通配符关键点:
     * 可以限定类型的范围
     */
    public static void method(ArrayList<? super Fu1> list) {

    }
}
class Ye1 {
}

class Fu1 extends Ye {
}

class Zi1 extends Fu {
}

class Student2{}