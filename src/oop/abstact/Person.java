package src.oop.abstact;

public abstract class Person {

    private String name;
    private int age;

    //作用:当创建了类对象时，给属性进行赋值的
    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //可以有构造方法


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

    public abstract void work();

    public void sleep() {
        System.out.println("睡觉");
         //抽象类中不一定有抽象方法，有抽象方法的类一定是抽象类
    }


}
