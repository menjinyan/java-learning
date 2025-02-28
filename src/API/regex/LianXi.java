package src.API.regex;

public class LianXi {
    public static void main(String[] args) {
        /*
        请使用正则表达式完成如下需求
        需求
        请编写正则表达式验证用户输入的手机号码是否满足要求。
        请编写正则表达式验证用户输入的邮箱号是否满足要求。
        请编写正则表达式验证用户输入的电话号码是否满足要求。

        验证手机号码
        13112345678
        13712345667
        13945679027
        139456790271

        验证座机电话号码
        820-2324242
        02122442
        027-42424
        0712-3242434

        验证邮箱号码
        3232323@qq.com
        zhangsan@itcast.cnn
        dleieee9g163.com
        dleieee9@pci.com.cn
         */


        //手机号码
        //细节:拿着一个正确的数据，从左到右依次去写
        //13112345678
        //分成三部分
        //第一部分:表示手机号码只能以1开头不能是其他
        //第二部分:[3-9]表示手机号码第二位只能是3-9之间的
        //第三部分:\d{9} 表示任意数字可以出现9次，也只能出现9次
        String regex1 = "1[3-9]\\d{9}"; //表示任意的数字能出现9次，也只能出现9次
        System.out.println("13112345678".matches(regex1));//true
        System.out.println("13712345667".matches(regex1));//true
        System.out.println("13945679027".matches(regex1));//true
        System.out.println("139456790286".matches(regex1));//false
        System.out.println("---------------------");


        //座机号码
        //020-2324242
        //02122442
        //027-42424
        //0712-3242434

        //细节:
        //在书写座机号码的时候要把正确的数据分为三部分
        //1、区号
        //2、中间的-
        //3、后面正式的号码(号码的第一位也不能以0开头，从第二位开始可以是任意的数字，号码的总长度:5-10位)
        //0\\d{2,3} :0表示区一定是以0开头的  \\d{2,3}:表示区号从第二位开始可以是任意的数字，可以出现2到3次
        //中间的-可以出现1次或者0次  ？也可也表示1次或者0次
        String regex2 = "0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("020-2324242".matches(regex2));//true
        System.out.println("02122442".matches(regex2));//true
        System.out.println("027-42424".matches(regex2));//true
        System.out.println("0712-3242434".matches(regex2));//true
        System.out.println("----------------------");


        //邮箱号码
        //3232323@qq.com
        //zhangsan@itcast.cnn
        //dleieee9g163.com
        //dleieee9@pci.com.cn
        //在书写邮箱号码的时候要把正确的数据分为三部分
        //1、@的左边 \\w+任意的字母数字下划线至少出现一次就可以了
        //2、@只能出现1次
        //3、.的左边[\\w&&[^_]]{2,6} (任意的字母加数字总共只能出现2-6次，此时不能出现下划线)
        //4、 . \\.
        //5、 .的右边 (大写字母，小写字母都可以，只能出现2-3次[a-z A-Z]{2,3})
        //把4-5看成一组，这一组可以出现1次到2次
        String regex3 = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        System.out.println("3232323@qq.com".matches(regex3));//true
        System.out.println("zhangsan@itcast.cnn".matches(regex3));//true
        System.out.println("dleieee9@163.com".matches(regex3));//true
        System.out.println("dleieee9@pci.com.cn".matches(regex3));//true
    }
}