package src.Insert.Sort;

public class Demo01 {
    public static void main(String[] args) {
        /*
        插入排序
        将0索引的元素到N索引的元素是有序的，把N+1索引的元素和最后一个元素当成是无序的
        遍历无序的数据，将遍历的元素插入到有序序列种适当的位置，如遇到相同数据，插在后面
        N的范围:0~最大范围
         */
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        //1、找到无序的数据是从哪个索引开始的
        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                startIndex = i + 1;
                break;
            }
        }
        //2、遍历从startIndex开始到最后一个元素，依次得到无序的哪一组数据中每一个元素
        for (int i = startIndex; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
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
