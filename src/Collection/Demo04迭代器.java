package src.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo04迭代器 {
    public static void main(String[] args) {
        /*
        Collection系列集合三种通用的遍历方式：
        1.迭代器遍历
        2.增强for遍历
        3.1ambda表达式遍历

        迭代器遍历相关的三个方法：
        Iterator<E>iterator()：获取一个迭代器对象
        boolean hasNext()：判断当前指向的位置是否有元素
        E next()：获取当前指向的元素并移动指针
         */

        /*
        迭代器的细节注意点：
        1.报错NoSuchElementException
        2.迭代器遍历完毕，指针不会复位
        3.循环中只能用一次next方法
        4.迭代器遍历时，不能用集合的方法进行增加或者删除(暂时当一个结论先行记忆)
         */

        //1、创建集合添加元素
        Collection<String> A = new ArrayList<>();
        A.add("aaa");
        A.add("bbb");
        A.add("ccc");
        A.add("ddd");
        A.add("eee");

        //2、获取迭代器对象
        //迭代器对象就好比是一个箭头，默认指向集合的0索引处
        Iterator<String> it = A.iterator();

        //3、利用循环不断的去获取集合中的每一个元素
        while (it.hasNext()) {
            //4、next方法的两件事，获取元素以及移动指针
            String str = it.next();
            if ("bbb".equals(str)) {
                // A.remove("bbb");
                it.remove();
            }
        }
        System.out.println(A);
    }
}
