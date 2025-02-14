package src.API.System;

import src.oop.带有接口和抽象类的javabean.Person;

public class SystemDemo02 {
    public static void main(String[] args) {
      //  3、 public static void arraycopy(数据源数组，起始索引，目的地数组，起始索引，拷贝数据)  数组拷贝

        //细节:
        //1、如果数据源数组和目的地数组都是基本数据类型 那么两者的类型都必须保持一致，否者会报错

        /*
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] arr2 = new double[10];
        System.arraycopy(arr1, 0, arr2, 0, 10);
        //验证
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
         */
        //2、在拷贝的时候要考虑数组的长度，如果超出范围也会报错
        /*
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[5];
        System.arraycopy(arr1, 0, arr2, 0, 10);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
         */

        //3、如果数据源数组和目的地数组都是数据类型，那么子类类型可以赋值给父类类型
       /* Student s1=new Student("zhangsan",23);*/

    }
}
