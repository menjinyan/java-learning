package src.oop.polymorphism.多态的练习;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }
    /*行为:
    年龄，颜色
    eat(String something)方法(something表示吃的东西)
    逮老鼠catchMouse方法(无参数)*/

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的猫眯着眼睛侧着头吃" + something + "");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
