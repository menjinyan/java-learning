package src.Search.Code;

public class Demo03 {
    public static void main(String[] args) {
         /*
        核心:
        每次排除一半的查找范围

       需求:
       定义一个方法证明二分法查找，查询某个元素在数组中的索引
       数据如下:{7，23，79，81，103，127，147}

         */
        int[] arr = {7, 23, 79, 81, 103, 127, 147};
        System.out.println(search(arr,79 ));
    }

    public static int search(int[] arr, int number) {
        //1、记录要查找的范围
        int min = 0;
        int max = arr.length - 1;

        //2、利用循环不断的去查找数据
        while (true) {
            if (min > max) {
                return -1;
            }

            //3、找到中间的位置
            int mid = (min + max) / 2;

            //4、拿着mid的指向元素跟要查找的元素进行比较
            //第一种情况:number在mid的左边
            //第二种情况:number在mid的右边
            //第三种情况:number跟mid的指向元素一样
            if (arr[mid] > number) {
                max = mid - 1;
            } else if (arr[mid] < number) {
                min = (mid + 1);
            } else {
                return mid;
            }
        }
    }
}
