package src.Topics;

public class 找质数 {
    public static void main(String[] args) {
        //判断 101~200之间有多少个素数，并输出所有的素数
        //2~9之间有没有数字能被10整除
        //定义变量i 赋值100
        //判断i是否为质数
        //定义一个变量来统计有多少个质数
        int countt = 0;
        for (int i = 100; i < 200; i++) {
//i表示依次循环中的每一个数字
            System.out.println(i);
            //继续判断i是否为一个质数
            boolean flag = true;
            for (int j = 2; j < i; j++) {
//j表示2~99之间的每一个数字
                if (i % j == 0) {
                    flag = false;
                    break;  //这里的break跳出是内循环也就是单层循环
                }
            }
            if (flag) {
                System.out.println("当前数字" + i + "是质数");
                countt++;
            }
        }
        System.out.println("一共有" + countt + "个质数");
       /* int i = 7;
        boolean flag = true;
        for (int j = 2; j < i; j++) {
//j表示2~99之间的每一个数字
            if (i % j == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("当前数字是质数");
        } else {
            System.out.println("当前数字不是一个质数");
        }*/
    }
}
