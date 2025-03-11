package src.API.Test;

public class Demo03 {
    public static void main(String[] args) {

        /*
        定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制
         */
        System.out.println(toBinaryString(123));
        System.out.println(Integer.toBinaryString(123));
    }

    public static String toBinaryString(int num) {
        //核心逻辑:不端的的除以2，得到·余数，一直到商为0就结束
        //还需要把余数倒着拼接起来
        //定义一个StringBuilder用来拼接余数
        StringBuilder sb = new StringBuilder();
        //利用循环不断的除以我获取余数
        while (true) {
            if (num == 0) {
                break;
            }
            //获取余数  %
            int remainder = num % 2;
            sb.insert(0, remainder);
            //除以2
            num = num / 2;
        }
        return sb.toString();
    }
}
