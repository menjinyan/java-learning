package src.oop.带有接口和抽象类的javabean;

public class PingPongCoach extends Coach implements English {
    public PingPongCoach() {
    }

    public PingPongCoach(int age, String name) {
        super(age, name);
    }

    @Override
    public void Coach() {
        System.out.println("乒乓球教练在教如何打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练在学习如何学英语");
    }
}
