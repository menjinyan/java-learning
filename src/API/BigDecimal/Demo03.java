package src.API.BigDecimal;

import java.math.BigDecimal;

public class Demo03 {
    public static void main(String[] args) {
        /*
        1、public BigDecimal add(BigDecimal val)                          加法
        2、public BigDecimal subtract(BigDecimal val)                     减法
        3、public BigDecimal multiply(BigDecimal val)                     乘法
        4、publ1ic BigDecimal divide(BigDecimal val)                      除法
        5、public BigDecimal divide(BigDecimal val 精确到几位，舍入模式)      除法
         */

        //1、public BigDecimal add(BigDecimal val)                          加法

        BigDecimal b1 = BigDecimal.valueOf(10.0);
        BigDecimal b2 = BigDecimal.valueOf(3.0);
        BigDecimal b3 = b1.add(b2);
        System.out.println(b3);


        //2、public BigDecimal subtract(BigDecimal val)                     减法
        BigDecimal b4 = b1.subtract(b2);
        System.out.println(b4);

        //3、public BigDecimal multiply(BigDecimal val)                     乘法
        BigDecimal b5 = b1.multiply(b2);
        System.out.println(b5);

        //4、public BigDecimal divide(BigDecimal val)                       除法
        /*
        BigDecimal b6=b1.divide(b2);
        System.out.println(b6);
         */

        //5、public BigDecimal divide(BigDecimal val 精确到几位，舍入模式)      除法
        BigDecimal b7=b1.divide(b2,2,BigDecimal.ROUND_HALF_UP);
        System.out.println(b7);
    }
}
