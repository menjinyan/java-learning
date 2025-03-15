package src.Bubble.Sort;

public class Demo01 {
    public static void main(String[] args) {
        /*
        冒泡排序:
        核心思想:
        1、相邻元素两两比较。大的在右边，小的在左边
        2、第一轮比较完毕之后，最大值就已经确定，第二轮可以少循环一次，后面的依次类推
        3、如果数组中有n个数据，总共我们只要执行 n-1 轮的代码就可以
         */

        //1、定义数组
        int[] arr = {2, 4, 5, 3, 1};

        //2、利用冒泡排序将数组中的数据改为1 2 3 4 5
        //第一轮:
        //结束之后，最大的数组的最右边   5

        //外循环:表示我们要执行多少轮 如果有n个数据，那么执行i-1轮
        for (int i = 0; i < arr.length - 1; i++) {
            //内循环:每一轮种我们如何比较数据找到当前最大的数
            //-1 是为了防止索引越界
            //-i 提高效率。每一轮执行次数应该比上一轮少一次
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //i 依次表示数组中的每一个索引 0 1 2 3 4
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
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