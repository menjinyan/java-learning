package src.Topics;

public class 数字解密 {
    public static void main(String[] args) {
        /*某系统的数字密码(大于0),比如1983，采用加密的方式进行传输，
        规则如下:
        每位数加上5，
        在对余求10.最后将所有的数字反转
        得到一串新的数字，
        按照以往规则进行解密
        比如1983加密之后变成8364，解密之后变成1983*/

        //1、定义数组记录解密之后的结果
        int[] arr = {8, 3, 4, 6};
        //2、反过来推
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        //3、由于加密是通过对10取余的方式进行获取的
        //所以在解密的时候就需要判断 0~4之间+10 5~9之间数字不变
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4) {
                arr[i] = arr[i] + 10;
            }
        }
        //4、每一位减5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 5;
        }
        //5、获取数组里面的每一位数字拼接成最终的结果
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        System.out.println(number);

    }
}
