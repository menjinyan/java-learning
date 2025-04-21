package src.Generics;

import java.util.ArrayList;
import java.util.Iterator;


public class Demo01 {
    public static void main(String[] args) {
        /*
        没有泛型的时候，集合如何存储数据
        结论:
        如果我们没有给集合指定类型，默认认为所有的数据类型都是object类型
        此时可以在集合添加任意的数据类型
        此时带来一个坏处，就是我们在获取数据的时候，无法使用他的特有行为

        此时推出了泛型，可以在添加数据的时候把类型进行统一
        而且我们在获取数据的时候，也省的强转了
         */

        //1、创建集合对象
        ArrayList<String> list = new ArrayList();

        //2、添加数组
        //list.add(123);
        //list.add("aaa");
        //list.add(new Student("zhangsan", 123));

        //3、遍历集合中的每一个元素
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            //Object obj = iterator.next();
            //多态的弊端是不能访问子类的特有的功能的
            //str.length();
            System.out.println(str);
        }
    }
}
