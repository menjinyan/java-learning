package src.MyList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class Demo03 {
    public static void main(String[] args) {
        /*
        List系列集合的五种遍历方式：
        1.迭代器
        2.列表迭代器
        3.增强for
        4.Lambda表达式
        5.普通for循环
         */

        //创建集合并添加元素
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        //1.迭代器
        /* Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            System.out.println(string);
        }*/

        //3.增强for
        //注释:
        //下面的string其实就是一个第三方的变量而已
        //在循环的过程中依次表示集合中的每一个元素

        /*for (String string : list) {
            System.out.println(string);
        }*/

        // 4.Lambda表达式
        //forEach方法的底层就是一个循环的遍历，依次得到集合中的每一个元素
        //并把元素传递给下面的accept方法
        //accept的形参s就是依次表示集合中的每一个元素

        //list.forEach(s -> System.out.println(s)
        //);

        //5.普通for循环

        //size方法和get方法还有循环结合的方式，利用索引可以获取到集合中的每一个元素
        for (int i = 0; i < list.size(); i++) {
            //i依次表示集合中的每一个索引
            String s = list.get(i);
            System.out.println(s);
        }

        // 2.列表迭代器
        //获取一个列表里迭代器的对象，里面的指针数默认也是指向0索引的

        //额外添加了一个方法，在遍历的过程中，可以添加元素
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String s = listIterator.next();
            if ("2".equals(s)) {
                listIterator.add("3");
            }
            System.out.println(s);
        }
    }
}
