package src.oop.带有抽象结构的Javabean类;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("狗在吃骨头");
    }
}
