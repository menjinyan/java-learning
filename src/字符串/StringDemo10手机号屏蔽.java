package src.字符串;

public class StringDemo10手机号屏蔽 {
    public static void main(String[] args) {
        //1、获取一个手机号码
        String phoneNumber = "15391761008";
        //2、截取手机号的前三位
        String start = phoneNumber.substring(0, 3);

        //3、截取手机号码后面2位
        String end = phoneNumber.substring(7);
        //4、拼接
        String result = start + "****" + end;
        //5、打印
        System.out.println(result);
    }
}
