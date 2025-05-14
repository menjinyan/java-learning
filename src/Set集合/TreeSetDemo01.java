package src.Set集合;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class TreeSetDemo01 {
    public static void main(String[] args) {
        /**
         *需求：利用TreeSet存储整数并进行排序
         */

        //1、创建TreeSet集合的对象
        TreeSet<Integer> A = new TreeSet<>();

        //2、添加元素
        A.add(1);
        A.add(2);
        A.add(5);
        A.add(4);
        A.add(3);

        //3、打印集合
        //System.out.println(A);

        //4、遍历集合（三种遍历）
        //1、迭代器
        Iterator<Integer> IT = A.iterator();
        while (IT.hasNext()) {
            int i = IT.next();
            System.out.println(i);
        }
        System.out.println("++++++++++++");

        //2、增强for
        for (Integer i : A) {
            System.out.println(i);
        }
        System.out.println("=============");
        //3、lambda表达式
        A.forEach(integer ->
                System.out.println(integer));
    }
}
