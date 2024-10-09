package Topics;

public class 数组元素的复制 {
    public static void main(String[] args) {
        //需求
        //把一个数组复制到一个新的数组当中去
        //假设有一个数组是12345，那么复制到新的数组中也是12345

        //分析:
        //1、定义一个老数组存储一些元素
        int[]arr={1,2,3,4,5};
        //2、定义一个新的数组，数组的长度和老数组的长度一致
        int[] newarr=new int[arr.length];
        //3、遍历老数组，得到老数组中的每一个元素，以此存放到新的数组中去
        for (int i = 0; i < newarr.length ; i++) {
            //i表示老数组中的索引，也是新数组中的索引
            //arr[i]表示老数组中的元素
            newarr[i]=arr[i];//表示把老数组中的索引存入到新数组中
        }
        //4、新数组已经存满元素了
        for (int i = 0; i < newarr.length; i++) {
            System.out.println(newarr[i]);
        }
    }
}
