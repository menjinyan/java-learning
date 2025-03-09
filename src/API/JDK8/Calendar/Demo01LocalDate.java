package src.API.JDK8.Calendar;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class Demo01LocalDate {
    public static void main(String[] args) {
        //1、获取当前时间的日历1对象(包含年月)
        LocalDate date = LocalDate.now();
        //System.out.println("今天的日期:" + date);

        //2、获取指定的时间的日历对象
        //LocalDate date = LocalDate.of(2025, 1, 1);
        //System.out.println("指定的日期: " + date);

        //3、get系列方法获取日历中的每一个属性值

        //1、获取年
        //LocalDate date = LocalDate.now();
        //int year=date.getYear();
        //System.out.println("year: " + year);

        //2、获取月
        //方式一:
        //LocalDate date = LocalDate.now();
        //Month month = date.getMonth();
        //System.out.println(month);
        //System.out.println(month.getValue());

        //方式二:
        //LocalDate date01 = LocalDate.now();
        //int dayOfYear=date.getDayOfMonth();
        //System.out.println("day:"+dayOfYear);

        //获取日:
        //int day=date.getDayOfMonth();
        //System.out.println("day:"+day);

        //获取一年前的第几天
        //int dayOfYear = date.getDayOfYear();
        //System.out.println("dayOfYear: " + dayOfYear);

        //获取星期
        //DayOfWeek dayOfWeek = date.getDayOfWeek();
        //System.out.println(dayOfWeek);
        //System.out.println(dayOfWeek.getValue());

        //with开头的方法表示修改，只能修改年月日
        LocalDate withLocalDate = date.withYear(2018);
        System.out.println(withLocalDate);

        //plus开头的方法表示增加，只能增加年月日
        LocalDate plusDays = date.plusDays(1);
        System.out.println(plusDays);


        //判断今天是不是你的生日
        LocalDate birthday = LocalDate.of(2002, 7, 28);
        LocalDate now = LocalDate.now();
        MonthDay birthdayMonthDay = MonthDay.of(birthday.getMonth(), birthday.getDayOfMonth());
        MonthDay nowMonthDay = MonthDay.from(now);
        System.out.println("今天是你的生日吗?" + birthdayMonthDay.equals(nowMonthDay));

    }
}
