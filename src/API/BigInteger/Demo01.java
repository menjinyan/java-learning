package src.API.BigInteger;

import java.math.BigInteger;

import java.util.Random;

public class Demo01 {
    public static void main(String[] args) {
        /*
        1、public BigInteger(int num. Random rnd)      获取随机的大整数 范围[0 ~ 2的num次方-1]
        2、public BigInteger(String val)               获取指定的大整数
        3、public BingInteger(String val,int radix)     获取指定进制的大整数
        4、public static BigInteger valueOf(long val)  静态方法获取BingInteger的对象内部有优化
        细节:
        5、对象一旦创建内部的数据不能发生改变
         */

        //1、获取一个随机的大整数 范围[0 ~ 2的num次方-1]
        /*
        Random R = new Random();
        for (int i = 0; i < 100; i++) {
            BigInteger B = new BigInteger(4, new Random());
            System.out.println(B);
        }
        //在 0 ~ 2^4—1 之间去获取数据，也就是 0 ~ 16-1
         */

        //2、获取指定的大整数
        //细节:字符串中必须是整数不然会报错
        /*
        BigInteger B2 = new BigInteger("100");
        System.out.println(B2);
         */

        //3、获取指定进制的大整数
        //细节:
        //1、字符串中的数字必须是整数
        //2、字符串中的数字必须和进制吻合
        //比如在二进制中，那么只能写0和1，写其他的会报错
        /*
        BigInteger B3 = new BigInteger("100", 2);
        System.out.println(B3);
         */

        //4、静态方法获取BingInteger的对象内部有优化
        //细节:
        //1、能表示的范围比较小 在long 范围之外就不可以了
        //获取Long的最大值
        //System.out.println(Long.MAX_VALUE);//9223372036854775807
        //BigInteger B4 = BigInteger.valueOf(9223372036854775807L);//这串数字超出int类型，所以要加L表示当前数字采取Long类型
        //System.out.println(B4);

        //2、在内部对常用的数字:-16 ~ 16 进行了优化
        //提前把-16 ~ 16 先创建好BingInteger的对象，如果多次获取不会重新创建新的
        /*
        BigInteger B5 = BigInteger.valueOf(16);
        BigInteger B6 = BigInteger.valueOf(16);
        System.out.println(B5 == B6);//true

        BigInteger B7 = BigInteger.valueOf(18);
        BigInteger B8 = BigInteger.valueOf(18);
        System.out.println(B7 == B8);//false
         */

        //5、对象一旦创建内部的数据不能发生改变
        BigInteger B9 = BigInteger.valueOf(3);
        BigInteger B10 = BigInteger.valueOf(5);
        BigInteger result = B9.add(B10);
        System.out.println(result);//8
        //此时，不会修改参与计算的BigInteger对象中的值，而是产生了一个新的BigInteger对象记录8
    }
}
