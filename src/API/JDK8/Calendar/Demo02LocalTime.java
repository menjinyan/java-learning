package src.API.JDK8.Calendar;

import java.time.LocalTime;

public class Demo02LocalTime {
    public static void main(String[] args) {

        //获取本地时间的体力对象，(包含时分秒)
        LocalTime now = LocalTime.now();
        System.out.println("今天的时间:" + now);

        //时
        int hour = now.getHour();
        System.out.println("hour:" + hour);

        //分
        int minute = now.getMinute();
        System.out.println("minute:" + minute);

        //秒
        int second = now.getSecond();
        System.out.println("second:" + second);

        //纳秒
        int nano = now.getNano();
        System.out.println("nano:" + nano);


        System.out.println("----------");
        System.out.println(LocalTime.of(3, 15));//时分
        System.out.println(LocalTime.of(3, 15, 30));//时分秒
        System.out.println(LocalTime.of(3, 15, 30, 40));//时分秒纳秒


        //is系列的方法
        System.out.println(now.isBefore(LocalTime.of(3, 15, 30)));
        System.out.println(now.isAfter(LocalTime.of(3, 15, 30)));

        //with系列的方法
        System.out.println(now.withHour(2));

        //minu系列的方法，只能修改时、分、秒
        System.out.println(now.minusHours(2));

        //plus系列的方法，只能修改时，分，秒
        System.out.println(now.plusHours(1));
    }
}
