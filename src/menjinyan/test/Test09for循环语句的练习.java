package src.menjinyan.test;

public class Test09for循环语句的练习 {
    public static void main(String[] args) {
        //for循环语句
        //练习 打印五次helloworld
        for (int i = 0; i < 5; i++) {
            System.out.println("helloworld");
        }
//        练习打印1~5
       for (int i = 1; i <=5; i++) {
            System.out.println(i);
        }
//        练习打印5~1
       for (int i = 5; i >=1; i--) {
            System.out.println(i);
        }

        //在玩游戏的时候，如果网络不好，需要断线重连，断线重连这个逻辑需要重复执行
        //要求这个业务最多写5次
        //开始条件1  结束条件5
//        for(int i=1;i<=5;i++){
//            System.out.println("执行断线重连的业务逻辑");
//        }
        //如果想要看到是第几次可以这样写
//
        //练习
        //求和（求1~5之间的和）
        //开始条件1 结束条件5
//        int sum=0;
//        for(int i=1;i<=5;i++) {
//            System.out.println(i);
//            sum = sum + i;
//            System.out.println(sum);
//        }

        //用for循环求1~100之间的偶数和
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0) {
//                sum =sum + i;
//            }
//        }
//        System.out.println(sum);

        //在键盘输入两个数，表示一个范围，统计这个范围中，能被3和5整除的数有多少
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个数字的范围表示开始");
//        int start = sc.nextInt();
//        System.out.println("请输入一个数字的范围表示结束");
//        int end = sc.nextInt();
//        for (int i = start; i <= end; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println(i);
//            }
//        }
    }
}
