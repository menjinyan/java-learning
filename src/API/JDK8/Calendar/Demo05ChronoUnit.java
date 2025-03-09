package src.API.JDK8.Calendar;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Demo05ChronoUnit {
    public static void main(String[] args) {

        //当前时间
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        //生日时间
        LocalDateTime birthday = LocalDateTime.of(2000, 7, 28, 3, 56);
        System.out.println(birthday);

        System.out.println("相差的年数:"+ ChronoUnit.YEARS.between(birthday, today));
        System.out.println("相差的月份:"+ChronoUnit.MONTHS.between(birthday, today));
        System.out.println("相差的周数:"+ChronoUnit.WEEKS.between(birthday, today));
        System.out.println("相差的天数:"+ChronoUnit.DAYS.between(birthday, today));
        System.out.println("相差的时数:"+ChronoUnit.HOURS.between(birthday, today));
        System.out.println("相差的秒数:"+ChronoUnit.SECONDS.between(birthday, today));
        System.out.println("相差的毫秒数"+ChronoUnit.MINUTES.between(birthday, today));
        System.out.println("相差的半天数"+ChronoUnit.HALF_DAYS.between(birthday, today));
        System.out.println("相差的十年数"+ChronoUnit.DECADES.between(birthday, today));
        System.out.println("相差的世纪"+ChronoUnit.CENTURIES.between(birthday, today));

    }
}
