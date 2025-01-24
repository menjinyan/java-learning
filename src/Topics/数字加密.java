package src.Topics;

public class 数字加密 {
    public static void main(String[] args) {
        //需求:
        //一串密码（大于0）比如1983，采用加密的方式进行传输
        //规则:先得到每位数字，然后每位数字加上5，再对10求余，最后将所有的数字反转，得到一串新数。

        //分析:
        //1、把整数里的每一位放到数组中
        int[] arr = {1, 9, 8, 3};
        //2、加密
        //每位数字加上5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //对10取余
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }
        //将所有的数字进行反转
        for (int i = 0, a = arr.length - 1; i < a; i++, a--) {
            int temp = arr[i];
            arr[i] = arr[a];
            arr[a] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");

        }
        //3、把数组里面的每一个数字进行拼接，变成加密之后的结果
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        System.out.println(number);
    }
}
