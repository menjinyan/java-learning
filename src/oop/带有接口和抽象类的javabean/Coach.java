package src.oop.带有接口和抽象类的javabean;

public abstract class Coach extends Person {
    public Coach() {
    }

    public Coach(int age, String name) {
        super(age, name);
    }

    public abstract void Coach();
}
