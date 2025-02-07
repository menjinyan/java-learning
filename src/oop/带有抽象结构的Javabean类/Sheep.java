package src.oop.带有抽象结构的Javabean类;

public class Sheep extends Animal {
    public Sheep() {
    }

    public Sheep(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("山羊在吃草");
    }
}
