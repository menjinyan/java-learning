package src.menjinyan.java;

public class demo {
    public static void main(String[] args) {
        //逻辑运算符

        //1、& 并且
        //运算逻辑：两边都为真，结果才是真
//        System.out.println(true & true);
//        System.out.println(true & false);
//        System.out.println(false & false);
//        System.out.println(false & true);
        //2 | 或者
        //运算逻辑：两边都为假，结果才是假，只要有一个为真结果就是真
//        System.out.println(true | true);
//        System.out.println(true | false);
//        System.out.println(false | false);
//        System.out.println(false | true);

        //3、^异或
        //运算逻辑：相同为false 不相同为true
//        System.out.println(true ^ false);
//        System.out.println(true ^ true);
//        System.out.println(true ^ false);
//        System.out.println(false ^ true);

        //4、！逻辑非   取反
//        System.out.println(!false);
//        System.out.println(!true);

        //5、练习  数字6
        //需求：数字6是一个真正伟大的数字，键盘录入两个整数
        //如果其中一个为6，最终输出结果是true
        //如果他们的和为6的倍数，最终输出为true,其他情况都是false.
        //分析
        //1、键盘输入两个整数
        //变量a 变量b
        //2、a == 6 || b == 6 (a+b)%6 == 0  (如果满足其中一个那么就可以输出为true)
        //键盘录入两个整数
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个整数");
//        int number1 = sc.nextInt();
//        System.out.println("请输入第二个整数");
//        int number2 = sc.nextInt();
////可以短路逻辑运算符去连接三个判断
//        boolean result =number1==6 || number2==6 || (number1+number2) % 6 ==0;
//        System.out.println(result);

        //三元运算符
        //练习1
        //需求：动物园里有两只老虎，体重分别为通过键盘录入获得，
        //请用程序实现判断两只老虎的体重是否相同。

        //分析：
        //1、键盘录入两只老虎的体重
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第一只老虎的体重");
//        int weight1 = sc.nextInt();
//        System.out.println("请输入第二只老虎的体重");
//        int weight2 = sc.nextInt();
//       String result = weight1==weight2 ? "相同" : "不同";
//       System.out.println(result);

        //练习2
        //需求：一座寺庙里住着三个和尚，已知的是150cm,120cm,165cm.
        //请用程序实现获取三个和尚的最高身高

        //1、定义三个变量记录的三个和尚的身高
//        int height1=150;
//        int height2=200;
//        int height3=165;
//        //2.拿着第一个和尚和第二个和尚进行比较
//        //拿着结果和第三个和尚进行比较即可
//        int temp=height1>height2 ? height1:height2;
//        int max=temp>height3 ? temp:height3;
//        System.out.println(max);

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


//        //if else语句
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
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入成绩");
//        int score = sc.nextInt();
//        if(score >0 && score <=100) {
//            if (score >= 95 && score <= 100) {
//                System.out.println("自行车");
//            }else if (score >= 90 && score <= 94) {
//                System.out.println("游乐场");
//            }else if (score > 80 && score <= 89) {
//                System.out.println("变形金刚");
//            }else {
//                System.out.println("打一顿");
//            }
//        }else{
//            System.out.println("录入的成绩不合规范");
//        }

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
