package src.StringBuilder;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringBuilderDemo04对称字符串 {
    public static void main(String[] args) {
        //使用StringBuilder的场景:
        //1、字符串的拼接
        //2、字符串的反转

        //需求:
        //键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是
        //对称字符串:123321、111
        //非对称字符串:123123

        //1、键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        //2、反转字符串
        String result = new StringBuilder().append(str).reverse().toString();

        //3、比较
        if (str.equals(result)) {
            System.out.println("当前字符串是对称字符串");
        } else {
            System.out.println("当前字符串不是对称字符串");
        }
    }
}
