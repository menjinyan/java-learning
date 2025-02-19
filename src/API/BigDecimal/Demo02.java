package src.API.BigDecimal;

import java.math.BigDecimal;
import java.math.BigInteger;


public class Demo02 {
    public static void main(String[] args) {
        /*
        构造方法获取BigDecimal对象
        public BigDecimal(double val)
        public BigDecimal(String val)

        静态方法获取BigDecimal对象
        public static BigDecimal valueOf(double val)
         */

        //1、通过创建double类型的小数来创建对象
        //细节:
        //这种方式有可能是不精确的，所以不建议使用
        /*
        BigDecimal B1 = new BigDecimal(0.01);
        BigDecimal B2 = new BigDecimal(0.09);
        System.out.println(B1);
        System.out.println(B2);
         */


        //2、通过传递的字符串表示小数来创建对象
        /*
        BigDecimal B3 = new BigDecimal("0.01");
        BigDecimal B4 = new BigDecimal("0.09");
        BigDecimal B5 = B3.add(B4);
        System.out.println(B3);
        System.out.println(B4);
        System.out.println(B5);
         */

        //3、通过静态方法获取对象
        BigDecimal B6 = BigDecimal.valueOf(10.0);
        BigDecimal B7 = BigDecimal.valueOf(10);
        System.out.println(B6==B7);


        //方式2、3用的是比较多的
        //细节:
        //如果要表示的数字不大，没有超出double的取值范围，建议使用静态方法也就是方式3
        //如果要表示的数字比较大，超出了double的取值范围i，建议使用构造方法也就是方式2
        //如果我们传递的是0~10之间的整数，包含10 那么方法会返回已经创建好的对象，不会重新new
    }
}
