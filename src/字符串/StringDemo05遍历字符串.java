package src.字符串;

import java.util.Scanner;

public class StringDemo05遍历字符串 {
    public static void main(String[] args) {
        //需求：键盘录入一个字符串，使用程序实现在控制台遍历该字符串

        //1、键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str= sc.next();
        //2、进行遍历
        for (int i = 0; i < str.length(); i++) {
            //i以此表示字符串的每一个索引
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}
