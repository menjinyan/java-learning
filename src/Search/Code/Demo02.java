package src.Search.Code;

public class Demo02 {
    public static void main(String[] args) {
        /*
        基本查找(也叫做顺序查找)
        从0索引开始挨个查找

        需求:定义一个方法利用基本查找，查询每个元素在数组中的索引，但是不需要考虑数组中元素是否重复
        数据如下:{121，13，141，151，161，4，34}
         */

        int[] arr = {121, 13, 141, 151, 161, 4, 34};
        int number = 11;
        //调用search方法查找元素的索引
        int index = search(arr, number);
        if (index != -1) {
            System.out.println("元素 " + number + " 在数组中的索引是: " + index);
        } else {
            System.out.println("元素 " + number + " 不在数组中。");
        }
    }

    public static int search(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }
}
