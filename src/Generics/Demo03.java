package src.Generics;

import java.util.ArrayList;

public class Demo03 {
    public static void main(String[] args) {
        /*
        定义一个工具类：ListUtil
        类中定义一个静态方法addAl1，用来添加多个集合的元素。
         */
        ArrayList<String> list = new ArrayList<>();
        ListUtil.addAll(list, "a", "b", "c", "d");
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        ListUtil.addAll(list2, 1, 2, 3, 4,5,6);
        System.out.println(list2);
    }
}
