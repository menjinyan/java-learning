package src.menjinyan.Demo;

public class Demo15数组的元素访问 {
    public static void main(String[] args) {
//利用索引对数组中的元素进行访问
        //1、获取数组里面的元素
        //格式： 数组名[索引]
        int [] arr ={1,2,3};
        //获取数组中的第一个元素
        //其实就是0索引上对应的元素
        int number=arr[0];
        System.out.println(number);  //打印结果为1
        //改写：
        //获取数组中1索引上对应的数据，并直接打印出来
        System.out.println(arr[0]); //结果为1
        System.out.println(arr[1]); //结果为2

        //2、把数据存储到数组中
        //格式:数组名[索引]=具体的数据/变量
        //细节：一旦覆盖之后，原来的数据就不存在了
        arr[0]=100;
        System.out.println(arr[0]);  //打印结果为100
    }
}
