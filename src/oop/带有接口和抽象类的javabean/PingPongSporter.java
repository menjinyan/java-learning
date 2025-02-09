package src.oop.带有接口和抽象类的javabean;

public class PingPongSporter extends Sport implements English {

    public PingPongSporter() {
    }

    public PingPongSporter(int age, String name) {
        super(age, name);
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员在说英语");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员在学习打乒乓球");
    }
}
