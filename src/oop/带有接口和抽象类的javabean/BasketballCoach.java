package src.oop.带有接口和抽象类的javabean;

public class BasketballCoach extends Coach {
    public BasketballCoach() {
    }

    public BasketballCoach(int age, String name) {
        super(age, name);
    }

    @Override
    public void Coach() {
        System.out.println("篮球教练在教人打篮球");
    }
}
