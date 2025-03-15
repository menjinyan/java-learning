package src.QuickSort;

public class Demo01 {
    public static void main(String[] args) {
        /*
        快速排序:
        第一轮:以0索引的数字为基准数，确定就基准数在数组中正确的位置
        比基准数小的全部在左边，比基准数大的全部在右边
        后面依次类推
         */

        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        QuickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /*
    参数一:我们要排序的数组
    参数二:要排序数组起索引
    参数三:要排序数组的结束索引
     */
    public static void QuickSort(int[] arr, int i, int j) {
        //定义两个变量记录要查找的范围
        int start = i;
        int end = j;
        if (start > end) {
            //递归的出口
            return;
        }

        //记录基准数
        int baseNumber = arr[i];

        //利用循环找到要交换的数字
        while (start != end) {
            //利用end从后往前找到比基准数要小的数字
            while (true) {
                if (end <= start || arr[end] < baseNumber) {
                    break;
                }
                end--;
            }
            //利用start从前往后找比基准数要大的数字
            while (true) {
                if (end <= start || arr[start] > baseNumber) {
                    break;
                }
                start++;
            }
            //把end和start指向的元素进行交换就可以
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        //当start和end同时指向了同一个元素的时候，那么上面的循环就会结束
        //表示找到了基准数在数组中应存入的位置
        //基准数归为

        int temp = arr[i];
        arr[i] = arr[end];
        arr[start] = temp;

        //确定6左边的范围重复刚才的事情
        QuickSort(arr, i, start - 1);
        //确定6右边的范围重复刚才的事情
        QuickSort(arr, start + 1, j);
    }
}
