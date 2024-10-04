package src.menjinyan.test;

import java.util.Scanner;

public class T01 { public static void main(String[] args) {
    //键盘打印
    //创建对象，表示我们要准备用Scanner这个类
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    //接收数据
    //变量i记录了键盘录入的数据
    int i = sc.nextInt();
    System.out.println(i);//输出
}
}
