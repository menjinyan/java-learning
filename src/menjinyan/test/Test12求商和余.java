package src.menjinyan.test;

public class Test12求商和余 {
    public static void main(String[] args) {
        /*求商和余数
        需求：给定两个整数，被除数和除数（都是正数，且不超过int的范围）
        将两数相除，要求不使用乘法除法和%运算符，得到商和余。
        分析：
        什么是被除数和除数：被除数/除数 = 商 ... 余数

        int a =100;
        int b =10;但是要求不可以使用除法、乘法、和%运算符
        但是可以使用a-b=90
        也就是：
        100-10=90
        90-10=80
        80-10=70
        ...
        10-10=0(余数)
        */
//        //1、定义变量记录被除数
//        int dividend = 100;
//        //2、定义变量记录除数
//        int divisor =10;
//        //3、循环while
//        //在循环中，不断地用被除数—除数（得到的结果在赋值给被除数）
//        //只要被除数是大于除数的，那么就一直循环
//        while(dividend>=divisor){
//            dividend=dividend-divisor;
//        }
//        //当循环结束后dividend变量记录的就是余数
//        System.out.println(dividend);
        //改写：
        //1、定义变量记录被除数
        int dividend = 10;
        //2、定义变量记录除数
        int divisor = 3;
        //3、定义一个变量用来统计相减了多少次
        int count = 0;
        //3、循环while
        //在循环中，不断地用被除数—除数（得到的结果在赋值给被除数）
        //只要被除数是大于除数的，那么就一直循环
        while (dividend >= divisor) {
            dividend = dividend - divisor;
            //只要减一次统计变量就自增一次
            count++;
        }
        //当循环结束后dividend变量记录的就是余数
        System.out.println("余数为："+ dividend);
        //当循环结束之后，count记录的值就是商
        System.out.println("商为：" + count);

    }
}
