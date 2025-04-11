package src.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class Demo06Lambda表达式遍历 {
    public static void main(String[] args) {

        /*
        Co11ection系列集合三种通用的遍历万式：
       1.迭代器遍历
       2.增强for遍历
       3.1ambda表达式遍历

       lambda表达式遍历：
       default void forEach(Consumer<? super T> action):

         */

        //创建集合添加元素
        Collection<String> A = new ArrayList<>();
        A.add("zhangsan");
        A.add("wangwu");
        A.add("lisi");

        //2、利用匿名内部类的形式

        //forEach方法的底层原理:
        //其实也会把自己遍历集合，依次得到每一个元素
        //把得到的每一个元素，传递给下面的accept方法
        //s依次表示集合中的每一个数值
        /*A.forEach(new Consumer<String>() {
            @Override

            //s 依次表示集合中的每个数据
            public void accept(String s) {
                System.out.println(s);
            }
        });
        */

        //Lambda表达式遍历
        //（）->{}

        A.forEach(s -> System.out.println(s)
        );
    }
}
