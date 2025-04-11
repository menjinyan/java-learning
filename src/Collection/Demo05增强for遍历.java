package src.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo05增强for遍历 {
    public static void main(String[] args) {

        //快捷键使用:A.for

        /*
        Collection系列集合三种通用的遍历方式：
        1.迭代器遍历
        2.增强for遍历
        3.1ambda表达式遍历
        增强for格式：

        for(数据类型变量名：集合/数组){
}
         */

        //1、创建一个集合并添加元素
        Collection<String> A = new ArrayList<>();
        A.add("zhangsan");
        A.add("lisi");
        A.add("wangwu");

        //2、利用增强for进行遍历
        //注意点:
        //s其实就是一个第三方变量在循环的过程中依次表示集合中的每一个数据
        for (String s : A) {
            s = "qqq";
        }
        System.out.println(A);
    }
}
