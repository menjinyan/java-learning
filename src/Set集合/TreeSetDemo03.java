package src.Set集合;

import java.util.TreeSet;

public class TreeSetDemo03 {
    public static void main(String[] args) {
        /**
         * 需求：请自行选择比较器排序和自然排序两种方式：
         * 要求：存入四个字符串，“c”，“ab”.“df”。“qwer”
         * 按照长度排序，如果一样长则按照首字母排序
         *
         * 采取第二章排序方式:
         * 比较器排序
         *
         */

        //1、创建集合
        //o1:表示当前要添加的元素
        //o2:表示已经在红黑树存在的元素
        //返回值和之前是一样的
        TreeSet<String> A = new TreeSet<>((o1,  o2) ->{
                //按照长度进行排序
                int i = o1.length() - o2.length();
                //按照首字母进行排序
                i = i == 0 ? o1.compareTo(o2) : i;
                return i;

        });

        //2、添加元素
        A.add("c");
        A.add("ab");
        A.add("df");
        A.add("qwer");

        //3、打印集合
        System.out.println(A);
    }
}
