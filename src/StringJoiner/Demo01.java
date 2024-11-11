package src.StringJoiner;

import java.util.StringJoiner;

public class Demo01 {
    public static void main(String[] args) {
       /* StringJoiner和StringBuilder一样，也可以看成是一个容器，创建之后里面的内容是可变的。
        作用:提高字符串的操作效率，而且代码编写的特别简洁，但是目前市场上很少有人用 */

        //1、创建一个对象，并指定中间的间隔符号
        StringJoiner sj = new StringJoiner("---");
        //2、添加元素
        sj.add("aaa").add("bbb").add("ccc").add("ddd");
        //3、打印结果
        System.out.println(sj);
    }
}
