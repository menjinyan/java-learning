package src.menjinyan.test;

public class Test11回文数 {
    public static void main(String[] args) {
        //回文数
        //需求：给你一个数X,如果X是一个回文数，打印true，如果不是返回false.
        //解释：回文数是指正序（从左向右）读都是一样的整数。
        //列如，121是回文，而123不是。

        //核心思路：把数字倒过来和原来的数字进行比较
        //1、定义数字
//        int x =12;
//        //2、获取个位
//        int ge = x % 10;
//        //获取十位：
//        int shi = x / 10 % 10;
//        //拼接
//        int result = ge*10 +shi;
//        System.out.println(result);

        //改写
        //定义数字
        int x = 121;
        //定义一个临时的变量用于记录x原来的值，用于最后进行比较
        int temp = x;
        //记录倒过来之后的结果
        int num = 0;
        //利用循环开始
        while (x != 0)
            while (x != 0) {
                //从右获取每一个数字
                int ge = x % 10;
                //修改一下x记录德值
                x = x / 10;
                //把当前获取到的数字拼接到最右边
                num = num * 10 + ge;
                //打印num
                System.out.println(num);
                System.out.println(x);
                //比较
                System.out.println(num == temp);
            }
    }
}
