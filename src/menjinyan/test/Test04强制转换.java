package src.menjinyan.test;

public class Test04强制转换 {
    public static void main(String[] args) {
        //强制转换练习
        byte b1=10;
        byte b2=20;
        int result=b1+b2;
        System.out.println(result);
//        说明：如果要把int转为byte 需要将b1+b2括起来在前面加一个byte（同时byte也需要加括号）
//        如：byte result=byte(b1+b2);
    }
}
