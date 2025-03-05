package src.API.JDK7Date;

import java.util.Date;

public class DateDemo01 {
    public static void main(String[] args) {
        /*
         public Date()           设置或修改毫秒值
        public Date(long date)   获取时间对象的毫秒值

        public void setTime(long time)    设置或修改毫秒值
        public long getTime()             获取时间对象的毫秒值
         */

        //1、创建对象表示一个时间
        Date d1 = new Date();
        //System.out.println(d1);

        //2、创建对象表示一个指定的时间
        Date d2 = new Date(0L);
        System.out.println(d2);

        //3、setTime修改时间
        long time = d2.getTime();
        System.out.println(time);
    }
}
