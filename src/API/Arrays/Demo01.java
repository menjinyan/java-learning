package src.API.Arrays;


import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {
        /*
        1、public static String toString(数组)                          把数组拼接成一个字符串
        2、public static int binarySearch(数组，查找的元素)               二分查找法查找元素
        3、public static int[] copyOf(原数组，新数组长度)                  拷贝数组
        4、public static int[] copyOfRange(原数组，起始索引，结束索引)      拷贝数组（指定范围）
        5、public static void fill(数组，元素)                           填充数组
        6、public static void sort(数组)                                按照默认方式进行数组排序
        7、public static void sort(数组。排序规则)                        按照指定规则进行排序
         */

        //1、public static String toString(数组)                          把数组拼接成一个字符串
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr));
        System.out.println("++++++++++");

        //2、public static int binarySearch(数组，查找的元素)               二分查找法查找元素
        //细节1:二分查找的前提，数组中的元素必须是有序的，数组中的元素必须是升序的
        //细节2:如果要查找的元素是不存在的，返回的是-插入点 -1
        //疑问:为什么要-1
        //解释:如果此时，要查找的数字是0，那么如果返回值是-插入点，就会出现问题了
        //如果要查找数组0，此时0是不存在的，但是按照上面的规则-插入点，应该就是-0
        //为了避免这样的情况，java在这个基础上就-1
        System.out.println(Arrays.binarySearch(arr, 10));
        System.out.println(Arrays.binarySearch(arr, 9));
        System.out.println(Arrays.binarySearch(arr, 20));
        System.out.println("++++++++++");

        //3、public static int[] copyOf(原数组，新数组长度)                  拷贝数组
        //参数1:老数组
        //参数2:新数组的长度
        //方法的底层就会根据第二个数据来创建新的数组
        //如果新数组的长度是小于老数组的长度，会部分拷贝
        //如果新数组的长度是等于老数组的长度，会完全拷贝
        //如果新数组的长度大于老数组的长度会默认补上初始化的值
        int[] newArr1 = Arrays.copyOf(arr, 20);
        System.out.println(Arrays.toString(newArr1));
        System.out.println("++++++++++");

        // 4、public static int[] copyOfRange(原数组，起始索引，结束索引)      拷贝数组（指定范围）
        //细节:包头不包围，包左不包右
        int[] newArr2 = Arrays.copyOfRange(arr, 10, 20);
        System.out.println(Arrays.toString(newArr2));
        System.out.println("++++++++++");

        //5、public static void fill(数组，元素)                           填充数组
        Arrays.fill(arr, 100);
        System.out.println(Arrays.toString(arr));
        System.out.println("++++++++++");

        //6、public static void sort(数组)                                按照默认方式进行数组排序
        int[] arr2 = {10, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(arr2));
        System.out.println("++++++++++");



    }
}
