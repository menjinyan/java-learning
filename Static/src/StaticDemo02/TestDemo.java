package StaticDemo02;

import java.lang.reflect.Array;

public class TestDemo {
    public static void main(String[] args) {
        //测试工具类中的两个方法是否正确

        int[] arr1 = {1, 2, 3, 4, 5};
        String str = ArrayUntil.pringArr(arr1);
        System.out.println(str);

        double[] arr2 = {1.5, 4.7, 4.3, 5.2};
        double avg = ArrayUntil.getAverage(arr2);
        System.out.println(avg);
    }
}
