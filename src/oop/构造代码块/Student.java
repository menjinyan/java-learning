package src.oop.构造代码块;

public class Student {
    private String name;
    private int age;

    //什么是构造代码块:
    //1、就是写在成员变量位置的代码块
    //2、作用:就是可以把多个构造方法中重复的代码块抽取出来
    //3、执行时机:我们在创建本类对象的时候，会先执行构造代码块再执行构造方法
    //这种技术也渐渐的淘汰了，因为不够灵活
    {
        System.out.println("开始创建对象了");
    }

    public Student() {
        System.out.println("空参构造");
    }

    public Student(int age, String name) {
        System.out.println("有参构造");
        this.age = age;
        this.name = name;
    }

    //添加接收一个 String 类型参数的构造方法
    public Student(String name) {
        System.out.println();
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
