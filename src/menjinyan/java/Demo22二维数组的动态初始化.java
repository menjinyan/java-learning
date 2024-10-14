package src.menjinyan.java;

public class Demo22二维数组的动态初始化 {
    public static void main(String[] args) {
        //格式：数据类型[][]数组名 = new 数据类型[m][n];
        //m表示这个二维数组，可以存放多少个一维数组
        //[n]表示每一个一维数组，可以存放多少元素

        //范例: int[][] arr=new int[2][3];
        //该数组可以存放2个一维数组，每一个一维数组中可以存放3个int类型的元素

        //1、利用动态初始化格式化创二维数组
        int[][] arr = new int[3][5];//3表示二维数组的长度为3，可以装3个一维数组，
        //3表示二维数组的长度为3，可以装3个一维数组
        //5表示每一个一维数组的长度都是5，可以装5个int类型的元素
        arr[0][0] = 10;

        //遍历二维数组
        //外循环:遍历二维数组获取里面的每一个一维数组
        //内循环：遍历一维数组获取每一个元素
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
