package src.API.regex;

public class Lianxi02 {
    public static void main(String[] args) {
        /*
        需求
●请编写正则表达式验证用户名是否满足要求。
要求：大小写字母，数字，下划线一共4-16位
●请编写正则表达式验证身份证号码是否满足要求。
简单要求：18位，前17位任意数字，最后一位可以是数字可以是大写或小写的x
复杂要求：按照身份证号码的格式严格要求。

身份证号码:
41080119930228457x
510801197609022309
15040119810705387X
130133197284039024
430102197606046442
         */

        //要求：大小写字母，数字，下划线一共4-16位[a-z A-Z 0-9]也就是\\w
        String regex1 = "\\w{4,16}";
        System.out.println("zhangsan".matches(regex1));//true
        System.out.println("lisi".matches(regex1));//true
        System.out.println("wangwu".matches(regex1));//true
        System.out.println("$123".matches(regex1));//false
        System.out.println("-------");

        //身份证号码的简单校验
        //18位，前17位任意数字，最后一位可以是数字可以是大写或小写的x
        String regex2 = "[1-9]\\d{16}(\\d|X|x)";
        System.out.println("41080119930228457x".matches(regex2));//true
        System.out.println("510801197609022309".matches(regex2));//true
        System.out.println("15040119810705387X".matches(regex2));//true
        System.out.println("130133197224039024".matches(regex2));//true
        System.out.println("430102197606046442".matches(regex2));//true
        System.out.println("-------");
        //忽略大小写的正确方式
        //在匹配的时候忽略大小写
        String regex4 = "(?i)abc";
        System.out.println("abc".matches(regex4));//true
        System.out.println("ABC".matches(regex4));//true
        System.out.println("Abc".matches(regex4));//true
        System.out.println("------");
        //忽略bc大小写
        String regex5 = "a(?i)bc";
        System.out.println("abc".matches(regex5));//true
        System.out.println("ABC".matches(regex5));//false
        System.out.println("Abc".matches(regex5));//true
        System.out.println("------");
        //忽略b的大小写
        String regex6 = "a((?i)b)c";
        System.out.println("abc".matches(regex6));//true
        System.out.println("ABC".matches(regex6));//false
        System.out.println("Abc".matches(regex6));//false
        System.out.println("------");


        //身份证号码的严格校验

        //编写正则的小细节:
        //第一步:按照正确的数据进行拆分
        //第二部:找每一部分的规律，并编写正则表达式
        //第三部分:把每一部分的正则拼接在一起，这个就是最终的结果
        //书写的时候要从左到右依次去拼写


        //410801 1993 02 28 457x
        //前6位:省份 市区 派出所等信息 第一位不能是0 后面5位不能是任意数字  [1-9]\\d{5}
        //年的前半段:18 19 20                                      (18|19|20)
        //年的后半段:任意数字出现2次                                  \\d{2}
        //月份: 01~09  10 11 12                                  (0[1-9][1[0-2])
        //日期:01~31  (01~09  10~19  20~29  30~31)               (0[1-9]|[12]\\d|3[01])
        //后面四位:任意数字出现3次 最后一位可以是数字也可以是大写的X或小写的x \\d{3}[\\dXx]
        String regex7 = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])\\d{3}[\\dXx]";
        System.out.println("41080119930228457x".matches(regex7));//true
        System.out.println("510801197609022309".matches(regex7));//true
        System.out.println("15040119810705387X".matches(regex7));//true
        System.out.println("130133197224039024".matches(regex7));//false
        System.out.println("430102197606046442".matches(regex7));//true
    }
}
