package src.API.Calendar;

import java.util.Calendar;
import java.util.Date;

public class Demo01 {
    public static void main(String[] args) {
        /*
        public static Calendar  getInstance()    获取当前时间的日历对象

        public final Date getTime()              获取日期对象
        public final setTime(Date date)          给日历设置日期对象

        public long getTime()                    拿到时间毫秒值
        public final setTimeInMillis()           给日历设置毫秒值

        public int get(int field)                取日期中的某个字段信息
        public void set(int field, int value)    修改日历中的某个字段信息
        public void add(int field,int amount)    为某个字段增加/减少指定的值
        */


        //1、获取日历对象

        //细节1:Calendar是一个抽象类，不能直接new而是通过一个静态方法获取到子类对象
        //底层原理:
        //会根据底层系统时间不同时区来获取不同的日历对象
        //会把时间中的纪元，年，月，日，时，分秒，星期，等等都放到一个数组当中

        //细节2:
        //月份:范围0~11 如果获取出来的是1 那么实际上是2月（在获取的基础上加一）
        //星期日:在老外的眼中是一个星期中的第一天


        Calendar c = Calendar.getInstance();
        System.out.println(c);

        //2、修改一下日历代表的时间
        Date d = new Date(0L);
        c.setTime(d);
        System.out.println(c);

        /*
        1、public int get(int field)                取日期中的某个字段信息
        2、public void set(int field, int value)    修改日历中的某个字段信息
        3、public void add(int field,int amount)    为某个字段增加/减少指定的值
         */


        //2、
        c.set(Calendar.YEAR, 2000);
        c.set(Calendar.MONTH, 8);
        c.set(Calendar.DAY_OF_MONTH, 10);

        //调用方法在这个星期上增加一个月
        c.add(Calendar.MONTH, -1);


        //1、
        //java在Calendar类中，把索引所对应的数字都定义为常量
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DAY_OF_MONTH);
        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year + "," + month + "," + date + "," + getweek(week));
    }

    //查表法(表就是我们的容器)
    //让数据和索引产生对应关系
    //传入对应的数字:1~7
    //返回对应的星期
    public static String getweek(int index) {
        String[] arr = {"", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        //根据索引返回对应的信息
        return arr[index];
    }
}
