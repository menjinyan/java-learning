package src.menjinyan.java;

import java.util.Scanner;

public class Demo11IfElse {
    public static void main(String[] args) {
        //if 语句的第三种格式练习
        //根据不同的分数送不同的礼物
        //如果是95~100分，送自行车
        //如果是90~94分 游乐场一天
        //如果是80~89分 变形金刚
        //如果是80分，打一顿
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩");
        int score = sc.nextInt();
        if (score > 0 && score <= 100) {
            if (score >= 95 && score <= 100) {
                System.out.println("自行车");
            } else if (score >= 90 && score <= 94) {
                System.out.println("游乐场");
            } else if (score > 80 && score <= 89) {
                System.out.println("变形金刚");
            } else {
                System.out.println("打一顿");
            }
        } else {
            System.out.println("录入的成绩不合规范");
        }
    }
}
