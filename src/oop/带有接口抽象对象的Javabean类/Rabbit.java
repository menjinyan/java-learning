package src.oop.带有接口抽象对象的Javabean类;

public class Rabbit extends Animal {
    public Rabbit() {
    }

    public Rabbit(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("兔子在吃胡萝卜");
    }
}
