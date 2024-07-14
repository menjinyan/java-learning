package src.menjinyan.test;

import java.util.Scanner;

public class Test08Switch的练习包括穿透 {
    public static void main(String[] args) {
        //switch练习
        //当我们拨打一个电话，需要某些服务时，都会有选择
        //假设我们打了一个机票预订的电话电话中提示：
        //1是机票查询 2是机票预订 3是机票改签 4是退出服务
        //其他按键也是退出服务
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                System.out.println("机票查询");
                break;
            case 2:
                System.out.println("机票预订");
                break;
            case 3:
                System.out.println("机票改签");
                break;
            case 4:
                System.out.println("退出服务");
                break;
            default:
                System.out.println("退出服务");
                break;
        }
        //可以改为
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入数字");
//        int choose=sc.nextInt();
//        switch (choose) {
//            case 1-> System.out.println("机票查询");
//            case 2-> System.out.println("机票预订");
//            case 3-> System.out.println("机票改签");
//            case 4-> System.out.println("退出服务");
//            default->System.out.println("退出服务");
//        }


    }
}
