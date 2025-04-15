package src.MyList;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
        /*
        List系列集合独有的方法：

        void add(int index,E element)  在此集合中的指定位置插入指定的元素

        E remove(int index)            删除指定索引处的元素，返回被删除的元素

        E set(int index,E element)     修改指定索引处的元素，返回被修改的元素

        E get(int index)               返回指定索引处的元素

         */

        //创建一个集合并添加元素
        List<String> list = new ArrayList<>();
        list.add("wangwu");
        list.add("lisi");
        list.add("aaaa");

        //1、void add(int index,E element)  在此集合中的指定位置插入指定的元素
        //细节:原来的索引上的元素会依次往后移
        list.add(1, "qqq");

        //2、E remove(int index)            删除指定索引处的元素，返回被删除的元素
        String remove = list.remove(0);
        System.out.println(remove);

        //3、E set(int index,E element)     修改指定索引处的元素，返回被修改的元素
        String result=list.set(0,"qqq");
        System.out.println(result);

        //6、E get(int index)               返回指定索引处的元素
       String s=list.get(0);
        System.out.println(s);

        //打印集合
        System.out.println(list);
    }
}
