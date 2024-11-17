package src.集合;

import java.util.ArrayList;

public class Test01集合的遍历方式 {
    public static void main(String[] args) {
        //需求:
        //定义一共集合，添加元素，并进行遍历，遍历格式参照:[元素1，元素2，元素3]

        //1、创建元素
        ArrayList<String> list = new ArrayList<>();

        //2、添加字符串
        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");
        list.add("dddd");

        //3、遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}