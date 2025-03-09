package src.API.JDK8.ZonedDateTime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Demo01 {
    public static void main(String[] args) {
        /*
        1、static ZonedDateTime now()           获取当前时间的ZonedDateTime对象
        2、static ZonedDateTime ofXxxx(...)     获取指定时间的ZonedDateTime对象
        3、ZonedDateTime withXxx(时间)           修改时间系列的方法
        4、ZonedDateTime minusXxx(时间)          减少时间系列的方法
        5、ZonedDateTime plusXxx(时间)           增加时间系列的方法
         */


        //1、static ZonedDateTime now()           获取当前时间的ZonedDateTime对象
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);
        System.out.println("----------");

        //2、static ZonedDateTime ofXxxx(...)     获取指定时间的ZonedDateTime对象
        ZonedDateTime zonedDateTime = ZonedDateTime.of(2023, 10, 1, 11, 12, 12, 0, ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);

        //通过Instant+时区的方法指定获取时间对象
        Instant instant = Instant.ofEpochMilli(0L);
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        ZonedDateTime time2 = ZonedDateTime.ofInstant(instant, zoneId);
        System.out.println(time2);
        System.out.println("----------");

        //3、ZonedDateTime withXxx(时间)           修改时间系列的方法
        ZonedDateTime time3 = time2.withYear(2025);
        System.out.println(time3);
        System.out.println("----------");


        //4、ZonedDateTime minusXxx(时间)          减少时间系列的方法
        ZonedDateTime time4 = time3.minusYears(1);
        System.out.println(time4);
        System.out.println("----------");


        //5、ZonedDateTime plusXxx(时间)           增加时间系列的方法
        ZonedDateTime time5 = time4.plusYears(1);
        System.out.println(time5);


        //细节:
        //JDK8新增的时间对象都是不可变的
        //如果我们修改了，减少了，增加了时间
        //那么调用者是不会发生改变的，产生一个新的时间
    }
}
