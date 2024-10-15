package src.menjinyan.test;

import java.util.Scanner;
//关系运算符的练习（约会）
//要求：你和你的约会对象在餐厅里面正在约会
//键盘录入两个数字，表示你和你约会对象衣服的时髦程度（手动录入1~10之间的整数）
//如果你的时髦程度大于你的约会对象的程度，相亲就会成功输出为true否则为false;

public class Test05键盘录入 {
    public static void main(String[] args) {
        //1、键盘录入两个整数的时髦度
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入自己的时髦度");
        int myfashion = sc.nextInt();
        System.out.println("请输入相亲对象的的时髦度");
        int girlfashion = sc.nextInt();
        //2、把自己的衣服的时髦度和女孩衣服的时髦度进行对比就可以
        boolean a=myfashion>girlfashion;
        //3、打印结果
        System.out.println(a);
    }
}
