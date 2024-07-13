package src.menjinyan.java;

public class demo {
    public static void main(String[] args) {



        //if语句：
        //需求：键盘录入女婿的酒量，如果大于2斤，老丈人给出回应，反之不回应
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入女婿的酒量");
//        int wine=sc.nextInt();
//        if(wine>2){
//            System.out.println("小伙子，不错");
//        }

        //练习1：
        //小红：如果你这次考试是第一，我就做你的女朋友
        //1、定义变量记录小鸣的成绩
//        int ranking=1;
//        //2、对小鸣的名字进行判断
//        if(ranking==1){
//            System.out.println("小红变为小明的女朋友");
//        }

        //练习2、
        //自动驾驶
        //当汽车行驶的时候遇到了红绿灯，就会进行判断
        //如果红灯亮起，就会停止
        //如果绿灯亮起，就会行速
        //如果黄灯亮起，就会减速
        //1、定义三个变量表示灯的状态（true亮 false灭）
//        boolean islightgreen = false;
//        boolean islightyellow = false;
//        boolean islightred =true;
//        if (islightgreen) {
//            System.out.println("gogogo");
//        }
//        if (islightyellow) {
//            System.out.println("slow");
//        }
//        if (islightred) {
//            System.out.println("stop ");
//        }


//


        //练习3：
        //需求：商场开启会员制，假设商品的总价为1000，会员1级打九折
        //会员2级打八折，会员三级打七折，不是会员不打折
        //1、定义变量的价格
//        int price=1000;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("输入会员的级别");
//        int vip=sc.nextInt();
//        if(vip==1){
//            System.out.println("实际支付的钱为"+(price * 0.9) );
//        }else if(vip==2){
//            System.out.println("实际支付的钱为"+(price * 0.8) );
//        }else if(vip==3){
//            System.out.println("实际支付的钱为"+(price * 0.7) );
//        }else{
//            System.out.println("实际支付的钱为" + price);
//        }

        //switch语句
        //小练习  吃面
        //兰州拉面，武汉热干面，北京炸酱面，陕西油泼面
        //1、定义变量记录我想吃的面
//        String noodles="陕西油泼面";
//        switch (noodles) {
//            case "兰州拉面":
//            System.out.println("陕西油泼面");
//            break;
//            case "武汉热干面":
//            System.out.println("吃武汉热干面");
//            break;
//            case "北京炸酱面":
//            System.out.println("吃北京炸酱面");
//            break;
//            case "陕西油泼面":
//            System.out.println("吃陕西油泼面");
//            break;
//            default:
//                System.out.println("吃方便面");
//                break;
//        }

        //小练习 运动
        //需求：键盘录入星期数，显示今天的减肥活动。
        //周一：跑步 周二：游泳 周三：慢走 周四：动感单车 周五：拳击 周六：爬山 周日：好好吃一顿
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入星期");
//        int week=sc.nextInt();
//        switch (week) {
//            case 1:
//                System.out.println("跑步");
//                break;
//            case 2:
//                System.out.println("游泳");
//                break;
//            case 3:
//                System.out.println("慢走");
//                break;
//            case 4:
//                System.out.println("动感单车");
//                break;
//            case 5:
//                System.out.println("拳击");
//                break;
//            case 6:
//                System.out.println("爬山");
//                break;
//            case 7:
//                System.out.println("吃一顿好的");
//                break;
//            default:
//                System.out.println("没有这个星期");
//                break;
//        }

        //switch的新特性（JDK12往上）
//        int number=3;
//        switch(number){
//            case 1 ->System.out.println("一");
//            case 2 ->System.out.println("二");
//            case 3 -> System.out.println("三");
//            default -> System.out.println("没有这个数");
//        }

        //switch中的case穿透
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个数表示星期");
//        int week=sc.nextInt();
//        switch  (week){
//            case 1,2,3,4,5:
//                System.out.println("工作日");
//                break;
//            case 6,7:
//                    System.out.println("休息日");
//                    break;
//            default:
//            System.out.println("没有");
//            break;
//        }
        //或者
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个数表示星期");
//        int week=sc.nextInt();
//        switch  (week) {
//            case 1, 2, 3, 4, 5 -> System.out.println("工作日");
//            case 6, 7 -> System.out.println("休息日");
//            default -> System.out.println("没有");
//        }

        //switch练习
        //当我们拨打一个电话，需要某些服务时，都会有选择
        //假设我们打了一个机票预订的电话电话中提示：
        //1是机票查询 2是机票预订 3是机票改签 4是退出服务
        //其他按键也是退出服务
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入数字");
//        int choose=sc.nextInt();
//        switch (choose) {
//            case 1:
//                System.out.println("机票查询");
//                break;
//            case 2:
//                System.out.println("机票预订");
//                break;
//            case 3:
//                System.out.println("机票改签");
//                break;
//            case 4:
//                System.out.println("退出服务");
//                break;
//            default:
//                    System.out.println("退出服务");
//                    break;
//        }
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

        //for循环语句
        //练习 打印五次helloworld
//        for (int i = 0; i < 5; i++) {
//            System.out.println("helloworld");
//        }
        //练习打印1~5
//        for (int i = 1; i <=5; i++) {
//            System.out.println(i);
//        }
        //练习打印5~1
//        for (int i = 5; i >=1; i--) {
//            System.out.println(i);
//        }

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
        //用while循环打印1~100
//

        //打印折纸的次数
        //珠穆朗玛峰的高度是8844430米，一张足够大的纸需要折叠多少次才可以(纸张的厚度是0.1毫米)
        //分析，每折一次，纸张的厚度是原先的2倍
        double a=0.1;
        a=a*2;
        a *=2;
        //定义一个变量用来记录山峰的高度
        double height=884430;
        //定义一个变量来记录纸张的初始厚度
        double paper=0.1;
        //定义一个变量用来统计次数
        int count=0;
        //循环折叠纸张。只要纸张的厚度小于山峰的高度，那么循环继续
        //每折叠一次。统计次数就要++
        //选择while理由：此时我们不知道循环的次数和循环的范围。只知道循环的条件，所以用while
        while(paper<height){
            paper=paper*2;
            count++;
        }
        System.out.println(count);

    }
}
