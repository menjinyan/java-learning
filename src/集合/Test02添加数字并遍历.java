package src.集合;

import java.util.ArrayList;

public class Test02添加数字并遍历 {
    public static void main(String[] args) {
        //需求:定义一个集,添加数字，并进行遍历
        //遍历格式参照:[元素1，元素2，元素3]

        //1、创建集合
        ArrayList<Integer> list = new ArrayList<>();

        //2、添加元素
        //JDK5以后 int Integer 之间是可以互相转化的
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //3遍历集合
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ",");
            }
        }
        System.out.println("]");
    }
}
