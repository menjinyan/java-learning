package src.menjinyan.java;

public class Demo17数组的动态初始化 {
    public static void main(String[] args) {
/*定义一个数组，用来存班级中50个学生的姓名
    姓名未知，等学生报道后，在进行1添加*/

        //格式：
        //数据类型[]数组名=new数据类型[数组长度]
        //在创建的时候，由我们自己指定恶的数组长度，由虚拟机给出初始化值

        String[]arr =new String[50];
        //添加学生
        arr[0]="zhangsan";
        arr[1]="lisi";
        //获取
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //数组默认的初始化的规律
        //整数类型：默认初始化的值0
        //小数类型：默认初始化的值0.0
        //字符类型：默认初始化的值 '/u0000' 展示为 空格
        //布尔类型：默认初始化值false
        //引用数据类型：默认初始化的值 null

        int[]arr2=new int [3];
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
    }
}
