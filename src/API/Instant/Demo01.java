package src.API.Instant;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Demo01 {
    public static void main(String[] args) {
        /*
        1、static Instant now()                       获取当前时间的Instant对象(标准时间)
        2、static Instant ofxxx(long epochMilli)       根据(秒、毫秒、纳秒)获取Instant对象
        3、ZoneDateTime atZone(ZoneId zone)           指定时区
        4、boolean isXxx(Instant otherUnstant)        判断系列的方法
        5、Instant minusXxx(long millisTouSubtract)   减少时间系列的方法
        6、Instant plusXxx(long millisTouSubtract)    增加时间系列的方法
         */


        //1、static Instant now()   获取当前时间的Instant对象(标准时间)
        //Instant now = Instant.now();
        //System.out.println(now);

        // 2、static Instat ofxxx(long apochMilli) 根据(秒、毫秒、纳秒)获取Instant对象
        Instant instat = Instant.ofEpochMilli(0L);
        System.out.println(instat);//1970-01-01T00:00:00Z(世界标准时间)


        Instant instat1 = Instant.ofEpochSecond(1L);
        System.out.println(instat1);//1970-01-01T00:00:01Z(表示1秒)

        Instant instat2 = Instant.ofEpochSecond(2L, 000000000L);
        System.out.println(instat2);//1970-01-01T00:00:02Z(表示时间节点过后的2秒)
        System.out.println("----------");
        //3、ZoneDateTime atZone(ZoneId zone) 指定时区
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);
        System.out.println("----------");

        //4、boolean isXxx(Instant otherUnstant)        判断系列的方法
        Instant instant3 = Instant.ofEpochMilli(0L);
        Instant instant4 = Instant.ofEpochMilli(1000L);

        //isBefore 判断调用者代表的时间是否在参数表示的时间前面
        boolean result = instant3.isBefore(instant4);
        System.out.println(result);

        //isAfter 判断调用者代表的时间是否在参数表示的时间后面
        boolean after = instant3.isAfter(instant4);
        System.out.println(after);
        System.out.println("----------");

        //5、Instant minusXxx(long millisTouSubtract)   减少时间系列的方法
        Instant instant = Instant.ofEpochMilli(12345678);
        System.out.println(instant);
        Instant instant1 = instant.minusSeconds(1);
        System.out.println(instant1);
    }
}
