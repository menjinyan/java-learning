package oop.extendsDemo02;

public class Test {
    public static void main(String[] args) {
        //利用空参构造创建子类对象
        Zi z1 = new Zi();

        //利用带参构造创建子类对象
        //Zi z2 = new Zi("zhangsan",23);
    }
}

class Fu {
    String name;
    int age;

    public Fu() {
    }

    public Fu(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Zi extends Fu {
    String name;
    //如果一个类中没有构造方法，虚拟机就会自动的给你添加一个空参构造
}