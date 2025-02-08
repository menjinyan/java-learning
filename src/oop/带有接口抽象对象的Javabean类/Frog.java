package src.oop.带有接口抽象对象的Javabean类;

public class Frog extends Animal implements Swim {

    public Frog() {
    }

    public Frog(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("青蛙在吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("青蛙在喝水");
    }
}
