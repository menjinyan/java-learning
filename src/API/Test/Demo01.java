package src.API.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        /*
        键盘录入
        键盘录入一些1~100之间的整数，并添加到集合中。
        直到集合中所有数据和超过200为止。
         */

        //1、创建一个集合用于添加集合
        ArrayList<Integer> list = new ArrayList<>();
        //2、键盘录入数据添加到集合中
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个整数");
            String line = sc.nextLine();
            int num = Integer.parseInt(line);
            //先把异常数据进行过滤
            if (num < 1 || num > 100) {
                System.out.println("数据异常，当前数字不在范围内，请重新输入");
                continue;
            }
            //添加到集合当中
            //细节:
            //num:基本数据类型
            //集合里面的数据都是Integer
            //在添加数据的时候出现了自动装箱
            list.add(num);

            //统计集合中所有的数据和
            int sum = getSum(list);
            //对sum进行判断
            if (sum > 200) {
                System.out.println("集合中的所有数据已经满足要求,当前集合元素总和为:" + sum);
                break;
            }
            //验证结论
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i) + " ");
            }
        }
    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            //i:索引
            //list.get():通过索引把元素拿出来
            int num = list.get(i);
            sum += num;
        }
        return sum;
    }
}
