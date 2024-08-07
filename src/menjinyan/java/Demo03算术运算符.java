package src.menjinyan.java;

public class Demo03算术运算符 {
    public static void main(String[] args) {
        //算术运算符
//          // +
        System.out.println(3+2);
        System.out.println(3-2);

        System.out.println(3*2);
        System.out.println(4/2);
        System.out.println(12%10);
        //如果在计算的时候有小数的参与
        //在代码中，如果有小数参与的计算结果有可能不精确
        System.out.println(1.1+1.01);
        System.out.println(1.1-1.01);
        System.out.println(1.1*1.01);
        System.out.println(1.1/1.01);

        //算术运算符的练习
        //1、数值拆分（需求：键盘录入一个三位数，将其拆分为个位，十位，百位，打印在控制台）
        //公式总结：个位：数值%10，十位：数值/ 10% 10， 百位：数值/100%10
        int number=456;
        int ge= number % 10;
        System.out.println( "个位是："+ge);
        int shi = number / 10 % 10;
        System.out.println("十位是:"+shi);
        int bai = number / 100 % 10;
        System.out.println( "百位是:"+bai);

    }
}
