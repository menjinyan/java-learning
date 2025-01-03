package StaticDemo02;

public class ArrayUntil {
    //私有化构造方法
    //目的，为了不让外界创建他的对象
    private ArrayUntil() {
    }

    //需要定义为静态，方便调用
    public static String pringArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            //i表示里面的每一个索引，arr[]表示里面的每一个元素
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static double getAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
