package src.oop.带有接口和抽象类的javabean;

public abstract class Sport extends Person {
    public Sport() {
    }

    public Sport(int age, String name) {
        super(age, name);
    }

    public abstract void study();
}
