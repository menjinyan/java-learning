package src.API.JDK8.DateTimeFormatter;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Demo01 {
    public static void main(String[] args) {
        /*
        1、static DateTimeFormatter ofPattern(格式)     获取格式对象
        2、String formate(时间对象)                      按照指定方式格式化
         */

        //1、static DateTimeFormatter ofPattern(格式)     获取格式对象
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        //获取时间对象
        DateTimeFormatter A = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //格式化
        System.out.println(A.format(time));
    }
}
