package src.API.JDK8.Zoneld;

import java.time.ZoneId;
import java.util.Set;

public class Demo01 {
    public static void main(String[] args) {
        /*
        1、static Set<String>getAvailabieZoneldIds()     获取Java中支持的所有时区
        2、static Zoneld systemDefault()                 获取系统默认时区
        3、static Zoneld of(String Zoneld)               获取一个指定时区
         */


        //1、获取Java中支持的所有时区
        Set<String> zoneIdsd = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIdsd.size());
        System.out.println(zoneIdsd);

        //2、获取系统默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        //3、获取一个指定时区
        ZoneId zoneId1 = ZoneId.of("Asia/Pontianak");
        System.out.println(zoneId1);
    }
}
