package oop.extendsDemo06;

public class Student extends Person {
    public Student() {
        //子类构造方法中隐藏的super()去访问父类中的无参构造
        super();
        System.out.println("子类中的无参构造");
    }
    public Student(String name, int age) {
        super(name,age);
    }
}
