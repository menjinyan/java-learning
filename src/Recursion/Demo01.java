package src.Recursion;

public class Demo01 {
    public static void main(String[] args) {
        /*
        求
        1~100之间的和
        //大间题拆解成小问愿
        //1~100之间的和=100+（1~99之间的和）
        //1~99之间的和=99+（1~98之间的和）
        //1~98之间的和=98+（1~97之间的和）
        //....
        //1~2之间的和=2+（1~1之间的和）
        //1~1之间的和=1 （这就是递归的出口）
         */

        System.out.println(getSum(100));
    }

    public static int getSum(int number) {
        if (number == 1) {
            return 1;
        }
        //如果不是1
        return number + getSum(number - 1);
    }
}
