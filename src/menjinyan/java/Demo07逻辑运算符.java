package src.menjinyan.java;

public class Demo07逻辑运算符 {
    public static void main(String[] args) {
        //逻辑运算符

        //1、& 并且
        //运算逻辑：两边都为真，结果才是真
        System.out.println(true & true);
        System.out.println(true & false);
       System.out.println(false & false);
        System.out.println(false & true);
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
    }
}
