package src.Topics;

public class 数字加密pro {
    public static void main(String[] args) {
        //需求:
        //把整数上的每一位都添加到数组当中
        //反向推到

        //1、计算出数组的长度
        int number = 12345;
        //定义一个变量临时记录Number的值，九十为了第三步的时候再次使用
        int temp = number;
//定义一个变量进行统计
        int count = 0;
        while (number != 0) {
//每一次循环去掉右边的一个数字
            number = number / 10;
            System.out.println(number);
            //去掉一位计数器就自增一次
            count++;
        }
        System.out.println(count);
        //2、定义一个数组
        //动态初始化
        int[] arr = new int[count];

        //3、把整数上的每一位都添加到数组当中
        int index = arr.length - 1;
        while (temp != 0) {
            //获取temp里面的每一位数组
            int ge = temp % 10;
            //再去掉右边的那位数字
            temp = temp / 10;
            //把当前获取到的个位添加到数组当中
            arr[index++] = ge;
            index--;
        }
        //验证结果 1 2 3 4 5
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
