package src.Set集合;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo01 {
    public static void main(String[] args) {
        /**
         * 利用Set系列的集合，添加字符中，并使用多种方式避历。
         * 迭代器
         * 増强for
         * Lambda表达式
         */

        //1、创建一个Set集合的对象
        Set<String> set = new HashSet<>();
        //2、添加元素
        //如果当前元素是第一次添加，那么可以添加成功，返回true
        //如果当前元素是第二次添加，那么添加失败，返回false
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");
        set.add("f");

        //3、打印集合
        System.out.println(set);

        //迭代器遍历
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }

        //增强for
        for (String string : set) {
        }

        //Lambda表达式
        set.forEach(str ->  System.out.println(str));
    }
}
