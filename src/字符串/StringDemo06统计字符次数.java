package src.字符串;

import java.util.Scanner;

public class StringDemo06统计字符次数 {
    public static void main(String[] args) {
        //需求:键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数（不考虑其他字符）
        //1、键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        //2、统计----也就是计数思想
        //定义三个计数器
        int bigcount = 0;
        int smallcount = 0;
        int numbercount = 0;
        for (int i = 0; i < str.length(); i++) {
            //i:依次表示字符串中的每一个索引
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                smallcount++;
            } else if (c >= 'A' && c <= 'Z') {
                bigcount++;
            } else if (c >= '0' && c <= '9') {
                numbercount++;
            }
        }
        //3、输出打印
        System.out.println("小写字母有:" + smallcount + "个");
        System.out.println("大写字母有:" + bigcount + "个");
        System.out.println("数字字母有:" + numbercount + "个");
    }
}
