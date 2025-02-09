package src.oop.带有接口和抽象类的javabean;

public class Test {
    public static void main(String[] args) {
        //创建运动员或者教练的对象
        PingPongSporter pps = new PingPongSporter(23, "马龙");
        System.out.println(pps.getName() + "," + pps.getAge());
        pps.study();
        pps.speakEnglish();
    }
}
