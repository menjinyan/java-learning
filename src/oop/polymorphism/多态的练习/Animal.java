package src.oop.polymorphism.多态的练习;

public class Animal {
    /*属性:
    行为:
    年龄，颜色
    eat(String something)(something表示吃的东西)*/
    private int age;
    private String color;

    public Animal() {
    }

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat(String something) {
        System.out.println("动物在吃" + something);
    }
}
