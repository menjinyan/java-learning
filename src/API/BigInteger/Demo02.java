package src.API.BigInteger;

import java.math.BigInteger;

public class Demo02 {
    public static void main(String[] args) {
        /*
        1、public BigInteger add(BigInteger val)                     加法
        2、public BigInteger subtract(BigInteger val)                减法
        3、public BigInteger multiply(BigInteger val)                乘法
        4、public BigInteger divide(BigInteger val)                  除法 获取商
        5、public BigInteger[] divideAndRemainder(BigInteger val)    除法 获取商和余数
        6、public boolean equalse (Object x)                         比较是否相等
        7、public BigInteger pow(int exponent)                       次幂
        8、public BigInteger max/min(BigInteger val)                 返回较大值/较小值
        9、public int intvalue (BigInteger val)                      转为int类型整数 超出范围数据有误
         */


        //创建两个BigInteger对象
        //因为这个方法在 -16 ~ 16 之间做了优化，会节约内存
        BigInteger b1 = BigInteger.valueOf(10);
        BigInteger b2 = BigInteger.valueOf(5);

        //1、public BigInteger add(BigInteger val)                     加法
        /*
        BigInteger b3 = b1.add(b2);
        System.out.println(b3);
         */


        //2、public BigInteger subtract(BigInteger val)                减法
        /*
         BigInteger b4 = b1.subtract(b2);
        System.out.println(b4);
         */


        //3、public BigInteger multiply(BigInteger val)                乘法
        /*
         BigInteger b5 = b1.multiply(b2);
        System.out.println(b5);
         */

        //4、public BigInteger divide(BigInteger val)                  除法 获取商
        /*
        BigInteger b6 = b1.divide(b2);
        System.out.println(b6);
         */


        //5、public BigInteger[] divideAndRemainder(BigInteger val)    除法 获取商和余数
        BigInteger[] arr = b1.divideAndRemainder(b2);
        //System.out.println(arr.length);//运行结果是2
        //为什么是2
        /*
        System.out.println(arr[0]);  //商
        System.out.println(arr[1]);  //余数
         */


        //6、public boolean equalse (Object x)                         比较是否相等
        /*
        boolean result = b1.equals(b2);
        System.out.println(result);
         */

        //7、public BigInteger pow(int exponent)                       次幂
        /*
        BigInteger b4 = b1.pow(2);//表示的是10的2次方
        System.out.println(b4);
         */

        //8、public BigInteger max/min(BigInteger val)                 返回较大值/较小值
        /*
        BigInteger b5 = b1.max(b2);
        System.out.println(b5);
         */

        //作比较
        /*
        BigInteger b5 = b1.max(b2);
        System.out.println(b5 == b1);//因为是max所以会把比较大的那个值做一个返回，不会创建新的对象
        System.out.println(b5 == b2);
         */

        //9、public int intvalue (BigInteger val)                      转为int类型整数 超出范围数据有误
        /*
        BigInteger b6 = BigInteger.valueOf(1000);
        int i = b6.intValue();
        System.out.println(i);
         */

        //int的最大数是2147483647

        /*
        BigInteger b7 = BigInteger.valueOf(2147483648L);
        int a = b7.intValue();
        System.out.println(a);//输出结果为-2147483648
         */

        /*
        BigInteger b8 = BigInteger.valueOf(2147483647);
        int b = b8.intValue();
        System.out.println(b);//输出结果为2147483647
         */


        //返回long类型
        /*
        BigInteger b7 = BigInteger.valueOf(2147483647L);
        long l = b7.longValue();
        System.out.println(l);
         */
        BigInteger b8 = BigInteger.valueOf(214);
        double v=b8.doubleValue();
        System.out.println(v);//输出的数值是214.0 是因为是double属于浮点数类型
    }
}
