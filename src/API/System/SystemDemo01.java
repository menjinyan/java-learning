package src.API.System;

public class SystemDemo01 {
    public static void main(String[] args) {
        /*
       1、 public static void exit(int static) 终止当前运行的java 虚拟机
       2、 public static long currentTimeMillis() 返回当前系统的时间毫秒值形式
       3、 public static void arraycopy(数据源数组，起始索引，目的地数组，起始索引，拷贝数据)  数组拷贝
         */

        /*
        犯方法的形参:
        状态码:
        0:表示当前虚拟机是正常停止
        非0:表示当前虚拟机异常停止
         */
        //1、
        //System.exit(0);
        //System.out.println("看看我执行了吗?");

        //2、
        long L = System.currentTimeMillis();
        System.out.println(L);

        //3、
        // 拷贝数组
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[10];
        //把arr1的数据拷贝到arr2当中
        //参数一:数据源，要拷贝的数组从哪个数组而来
        //参数二:从数据源数组中的第几个索引开始拷贝
        //参数三:目的地，我要把数据拷贝到哪个数组当中
        //参数四:拷贝的个数
        //System.arraycopy(arr1, 0, arr2, 0, 10);

        //练习1:如果要使arr2:0 0 0 1 2 3 0 0 0
        System.arraycopy(arr1,0,arr2,4,3);

        //练习2: arr2: 0 0 7 8 9 0 0 0 0
        System.arraycopy(arr1,6,arr2,2,3);

        //验证
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");

            //3的细节在Demo2

        }
    }
}
