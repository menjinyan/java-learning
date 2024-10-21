package src.对象数组练习02;

import java.util.Scanner;

public class car2 {
    public static void main(String[] args) {
        //键盘录入:
        //第一套体系:
        //nextInt();接受整数
        //nextDouble();接受小数
        //nex();接受字符串
        //通过空格，制表符，回车就停止接受，这些符号后面的数据就不会接收了

        //第一套体系整数
       /* Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int num2 = sc.nextInt();
        System.out.println(num2);*/

        //第一套体系字符串
        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1 = sc.next();
        System.out.println(str1);
        System.out.println("请输入第二个字符串");
        String str2 = sc.next();
        System.out.println(str2);*/

        //第二套体系:
        //nextLine();接受字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个字符串");
        String line1 = sc.nextLine();
        System.out.println("line1");
        System.out.println("请输入第二个字符串");
        String line2 = sc.nextLine();
        System.out.println("line2");
    }
}
