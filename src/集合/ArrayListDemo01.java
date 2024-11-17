package src.集合;

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        //1、创建集合的对象
        //泛型:限定集合中用来存储数据的类型


       /* boolean add(E e)  添加
        boolean remove(E e)删除
        E set(int index,E e) 修改
        E get(int index)  查询
        int size()  获取长度
        */


        //1、创建一个集合
        ArrayList<String> list = new ArrayList();

        //2、添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        //3、删除元素
       /* boolean result = list.remove("aaa");
        System.out.println(result);
        boolean result2 = list.remove("eee");
        System.out.println(result2);
          String str = list.remove(2);
        System.out.println(str);
        */

        //4、修改元素
      /*  String result = list.set(0, "ddd");
        System.out.println(result);
        System.out.println(list); */

        //5、查询元素
      /*  String s=list.get(0);
        System.out.println(s); */

        //6、遍历元素
        for (int i = 0; i < list.size(); i++) {
            //i表示索引
            //list.get(i) 元素
            String str = list.get(i);
            System.out.println(str);
        }

    }
}
