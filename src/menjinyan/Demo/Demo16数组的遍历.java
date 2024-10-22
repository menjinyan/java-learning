package src.menjinyan.Demo;

public class Demo16数组的遍历 {
    public static void main(String[] args) {
//1、定义数组
        int[] arr = {1, 2, 3, 4, 5};
        //2、获取数组里面的所有的元素
        //格式：数组名[索引]
        /*System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);*/

        //利用循环改进代码
        //开始条件0
        //结束条件：数组的长度 -1 （最大索引）
       /* for(int i=0;i<5;i++){
            //i:0 1 2 3 4
            System.out.println(arr[i]);
        }*/

        //在Java当中，关于数组长度对一个属性，length
        //调用方式：数组名，Length
        /*for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

        //扩展：
        //自动快速的生成数组的遍历方式
        //由idea提供
        //数组名。fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
