package src.Search.Code;

public class Demo01 {
    public static void main(String[] args) {
        /*
        基本查找(也叫做顺序查找)
        从0索引开始挨个查找

        需求:定义一个方法利用基本查找，查询每个元素是否存在
        数据如下:{121，13，141，151，161，4，34}
         */


        //定义一个数组
        int[] arr = {121, 13, 141, 151, 161, 4, 34};
        int number = 12;
        System.out.println(search(arr, number));
    }
    //参数
    //1、数组
    //2、要查找的元素

    //返回值
    //元素是否存在
    public static boolean search(int[] arr, int number) {
        //利用基本查找来查找number在数组中是否存在
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
