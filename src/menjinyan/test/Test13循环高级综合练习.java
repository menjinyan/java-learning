package src.menjinyan.test;

import java.util.Scanner;

public class Test13循环高级综合练习 {
    public static void main(String[] args) {
        //for格式的无限循环
        /*for (;;){
            System.out.println("学习");
        }*/

        //while格式的无限循环
        /*while(true){
            System.out.println("学习");
        }*/

        //注意事项：
        //无限循环的下面不能再写其他代码了，因为循环永远停不下来，下面的代码永远执行不到
//       while(true){
//           System.out.println("给女神表白");
//
//        }
        // System.out.println("女神答应我了"); 这一步就是在无限循环下面写的代码，执行不到


        //小老虎吃包子，有五个包子，第三个有虫子需要跳过。
        //1、跳过某一次循环
        /*for (int i=1;i<=5;i++){
            if(i==3){
                //2、结束本次循环进入下次循环
                continue;
            }
            System.out.println("小老虎在吃第"+i+"个包子");
        }*/

        //改写：
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("小老虎在吃第" + i + "个包子");
//            if (i == 3) {
//
//                //2、结束整个循环
//                break;
//            }
//
//        }

        //逢七过：朋友聚会的时候会玩一个游戏是逢七过，
        //游戏规则，从任意一个数字开始报数，当你要报的数字是包含7或者7的倍数时都要说过
        //需求：使用程序控制打印台打印1~100之间满足逢七过的数字

        //分析：个位7 十位7 7倍数
        //1 2 3 4 5 6 过（7）8 9 10 11 12 13 过（14）15 16 过（17）

        //1、得到1~100之间的每一个数
        /*for (int i = 1; i <= 100; i++) {
            //2、判断每一个数字，如果符号规则，就打印过，如果不是就打印数字
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }*/


        //求平方根
        //需求：键盘录入一个大于2的整数x，计算并返回x的平方根。
        //结果只保留整数部分，小数部分被舍去。
        //分析：平方根 16的是4  4的是2
        //比如 10的平方根
//        1 * 1 = 1 < 10
//        2 * 2 = 4 < 10
//        3 * 3 = 9 < 10
//        4 * 4 =16 > 10
//        推断：10 的平方根是在3 ~4 之间

//        在代码当中
//        从1开始循环，拿着数字的平方根和原来的数字进行比较
//        如果小于，那么继续往后判断
//        如果大于，那么前一个数字就是平方根的整数部分
        //1、键盘录入一个整数
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个整数");
//        int number = sc.nextInt();
//
//        boolean flag=true;
//        //2、从一开始循环判断
//        //开始：1 结束 number
//        for (int i = 1; i <= number; i++) {
//            //用i*和number进行比较
//            if (i * i == number) {
//                System.out.println(i + "就是" + number + "的平方根");
//                //一旦找到数字，循环就可以停止了，后面的数字就不需要再找了，提高代码的运行效率
//                break;
//            } else if (i * i > number) {
//                System.out.println((i - 1) + "就是" + number + "平方根的整数部分");
//                break;
//            }
//        }


              //求质数
        //键盘录入一个正整数X，判断该整数是否为一个质数
        //质数
        //如果一个整数能被1和本身整除，那么这个数就是一个质数，否则这个数就叫合数
        //7=1*7 质数
        //8=1*8 2*4 合数

        //分析
        //1、键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int number=sc.nextInt();

        //定义一个变量，表示标记
        //标记着number是否为一个质数
        //true:是一个质数
        //false:不是一个质数

        //表示最初就是
        boolean flag=true;
        //2、判断
        //写一个循环，从2开始判断，一直判断到Number-1为止
        //看这个范围之内，有没有数字可以被number整除
        for(int i=2;i<number;i++){
            //i 依次表示这个范围内的每一个数
            //看Number是否能被i整除就可以了
            if(number %i==0){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println(number+"是一个质数");
        }else{
            System.out.println(number+"不是一个质数");
        }

    }
}
