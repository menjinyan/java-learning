package src.Selection.Sort;

public class Demo01 {
    public static void main(String[] args) {
        /*
        选择排序
        1、从0索引开始，和后面的元素进行比较
        2、小的放前面，大的放后面
        3、第一次循环结束后，最小的数据确定
        4、第二次循环从1开始，依次类推
         */

        //1、定于数组
        int[] arr = {2, 4, 5, 3, 1};

        for (int i = 0; i < arr.length-1; i++) {
            //内循环:每一轮要干什么事情
            //拿着i和i后面的数据进行比较和交换
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        printArr(arr);
    }
    private static void printArr(int[] arr) {
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
