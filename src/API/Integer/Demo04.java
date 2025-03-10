package src.API.Integer;

public class Demo04 {
    public static void main(String[] args) {
        /*
        1、public static String toBinaryString(int i)      得到二进制
        2、public static String toOctalString(int i)       得到八进制
        3、publci static String toHexString(int i)         得到十六进制
        4、public static int parseInt(String s)            将字符串类型的整数转成int类型的整数
         */

        //1、把整数转换为为二进制
        String str1 = Integer.toBinaryString(100);
        System.out.println(str1);

        //2、把整数转换为为八进制
        String str2 = Integer.toOctalString(100);
        System.out.println(str2);

        //3、把整数转换为十六进制
        String str3 = Integer.toHexString(100);
        System.out.println(str3);

        //4、 将字符串类型的整数转成int类型的整数
        //强类型语言:每种数据在Java中都有各自的数据类型
        //在计算的时候，如果不是同一种数据类型，是无法直接计算的
        int i = Integer.parseInt("123");//不能有字母必须是纯数字
        System.out.println(i);
        System.out.println(i + 1);

        //细节1:
        //在类型转换的时候，括号中大的参数只能是数字不能是其他，否则代码会报错
        //细节2:
        //8种包装类当中，除了Character都有对应的parseXxx的方法，进行类型转换
        String str4 = "true";
        boolean b = Boolean.parseBoolean(str4);
        System.out.println(b);
    }
}
