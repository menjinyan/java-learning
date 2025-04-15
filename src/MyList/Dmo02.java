package src.MyList;

import java.util.ArrayList;
import java.util.List;

public class Dmo02 {
    public static void main(String[] args) {
        /*
        List系列集合中的两个删除的方法
         1.直接删除元素
         2.通过索引进行删除
         */

        //创建集合并添加元素
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //2、删除元素
        //访问:此时删除的是1这个元素，还是1索引上的元素
        //为什么？
        //因为在调用方法·的时候，如果方法出现了重载现象
        //优先调用，实参和形参类型一样的方法

        //list.remove(0);
        //System.out.println(list);
        Integer i = Integer.valueOf(1);
        list.remove(1);
        System.out.println(list);
    }
}
