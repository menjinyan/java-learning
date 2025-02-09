package src.oop.带有接口和抽象类的javabean;

public class BasketballSporter extends Sport {

    public BasketballSporter() {
    }

    public BasketballSporter(int age, String name) {
        super(age, name);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员在学习如何打篮球");
    }
}
