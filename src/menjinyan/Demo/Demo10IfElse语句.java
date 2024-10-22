package src.menjinyan.Demo;

import java.util.Scanner;

public class Demo10IfElse语句 {
    public static void main(String[] args) {
        //if else语句
//        //需求：键盘录入一个整数，表示身上的钱
//        //如果大于100，吃大餐，小于100吃经济实惠的小吃
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入钱数");
//        int money = sc.nextInt();
//        if (money >= 100) {
//            System.out.println("吃大餐");
//            }
//        else{
//            System.out.println("吃经济实惠的小吃");
//        }

        //if elae 语句的练习 1
        //商品付款  （在实际开发中，如果要根据两种不同的情况来执行不同的代码，就需要用到if的第二种格式）
        //需求：
        //假设，用户在超市实际购买，商品的总价为600元，键盘录入一个整数表示实际用户支付的钱，如果付款大于等于600，表示付款成功，否则失败
//        Scanner sc = new Scanner(System.in);
//        System.out.println("录入一个整数表示实际支付的钱");
//        int money = sc.nextInt();
//        if(money>=600){
//            System.out.println("付款成功");
//        }else{
//            System.out.println("付款失败");
//        }

        //if elae 语句练习 2
        //电影院卖票为1~100 奇数坐在左边偶数坐在右边
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个票号");
//        int ticket=sc.nextInt();
//        if(ticket >=0 && ticket<=100){
//
//                if(ticket % 2 ==1){
//                    System.out.println("做左边");
//                }
//                else{
//                    System.out.println("坐右边");
//                }
//        }

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
