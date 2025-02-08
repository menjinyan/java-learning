package src.oop.带有接口抽象对象的Javabean类;


public class Dog extends Animal implements Swim {

    public Dog() {
    }

    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗在游泳");
    }
}
