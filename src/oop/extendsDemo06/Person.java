package src.oop.extendsDemo06;

public class Person {
    String name;
    int age;

    public Person() {
        System.out.println("父类的无参构造");
    }

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }
}
