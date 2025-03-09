package src.API.JDK8.Calendar;

import java.time.Duration;
import java.time.LocalDateTime;

public class Demo04Duration {
    public static void main(String[] args) {

        //本地日期时间对象
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        //出生的日期和时间对象
        LocalDateTime birthday = LocalDateTime.of(2000, 7, 28, 3, 56);

        Duration duration = Duration.between(birthday, today);//第二个参数减去第一个参数
        System.out.println("==========");

        System.out.println("相差时间间隔对象: " + duration);
        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toMillis());
        System.out.println(duration.toSeconds());
    }
}
