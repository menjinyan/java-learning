package src.API.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01 {
    public static void main(String[] args) throws ParseException {
        /*
        public SimpleDateFormat()                   默认格式
        public SimpleDateFormat(String pattern)     指定格式

        public final String format(Date date)       格式化（日期对象 -> 字符串）
        oublic Date parse(String source)            解析:(字符串->日期对象)
         */

        //1、定义一个字符串吧表示时间
        String str = "2023-11-11 11:11:11";
        //2、利用空参构造创建SimpleDateFormat对象
        //细节:
        //创建对象的格式要和字符串的格式完全一致
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);
        //打印对象
        System.out.println(date.getTime());
    }

    private static void METHOD() {
        //1、利用空参构造创建 SimpleDateFormat对象 使用的是默认格式
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        Date date1 = new Date(0L);
        String str = sdf1.format(date1);
        System.out.println(str);

        //2、利用带参构造创建 SimpleDateFormat对象 使用的是指定格式
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
        String str2 = sdf2.format(date1);
        System.out.println(str2);


        //练习:yyyy年MM月dd日 时:分:秒 星期
    }
}
