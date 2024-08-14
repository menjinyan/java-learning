package src.menjinyan.test;

import static java.util.Arrays.copyOfRange;

public class Test15复制数组 {
    public static void main(String[] args) {
        /*需求：定义一个方法copyofrange(int[]arr,int from,int to)
        功能：将数组arr从索引from（包含from）开始。到索引to结束（不包含to）的元素复制到新数组中，将新数组返回。*/
        //1、定义原始数组
        int[] arr={1,2,3,4,5,6,7,8,9};

        //2、调用方法拷贝数据
        int[]copyArr=copyOfRange(arr,3,7);
        //3、遍历copyarr
        for(int i=0;i<copyArr.length;i++){
         System.out.println(copyArr[i]);
        }
    }
    //将数组arr从索引from（包含from）开始。到索引to结束（不包含to）的元素复制到新数组中
    public static int[] copyofrange(int[]arr,int from,int to){//3~7(3 4 5 6 7)
     //1、定义数组
        int[]newarr=new int[to-from];
        //2,把原始数组arr中的from到to上的对应的元素，直接拷贝到newArr中

            //伪造索引类型的思想
            int index=0;
        for(int i =from; i<to;i ++){
            newarr[i]=arr[i];
            //格式：数组名[索引]=数据值;
            newarr[index++]=arr[i];
            index++;
        }
        //3.把新数组返回
        return newarr;
    }
}
