package src.menjinyan.java;

import java.util.Scanner;

public class Demo12Switch {
    public static void main(String[] args) {
        //switch语句
        //小练习  吃面
        //兰州拉面，武汉热干面，北京炸酱面，陕西油泼面
        //1、定义变量记录我想吃的面
        String noodles="陕西油泼面";
        switch (noodles) {
            case "兰州拉面":
            System.out.println("陕西油泼面");
            break;
            case "武汉热干面":
            System.out.println("吃武汉热干面");
            break;
            case "北京炸酱面":
            System.out.println("吃北京炸酱面");
            break;
            case "陕西油泼面":
            System.out.println("吃陕西油泼面");
            break;
            default:
                System.out.println("吃方便面");
                break;
        }

        //小练习 运动
        //需求：键盘录入星期数，显示今天的减肥活动。
        //周一：跑步 周二：游泳 周三：慢走 周四：动感单车 周五：拳击 周六：爬山 周日：好好吃一顿
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期");
        int week=sc.nextInt();
        switch (week) {
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("吃一顿好的");
                break;
            default:
                System.out.println("没有这个星期");
                break;
        }
    }
}
