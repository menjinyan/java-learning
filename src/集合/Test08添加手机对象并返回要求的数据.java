package src.集合;

import java.util.ArrayList;

public class Test08添加手机对象并返回要求的数据 {
    public static void main(String[] args) {
        /*需求:
        定义javabean类:Phone
        Phone属性:品牌，价格。
        main方法中定义一个集合，存入三个手机对象。
        分别为:小米，1000。苹果，8000。锤子2999
        定义一个方法，将价格低于3000的手机信息返回.*/

        //1、创建集合对象
        ArrayList<Phone> list = new ArrayList<>();

        //2、创建手机对象
        Phone p1 = new Phone("小米", 4000);
        Phone p2 = new Phone("红米", 3000);
        Phone p3 = new Phone("锤子", 1000);

        //3、添加数据
        list.add(p1);
        list.add(p2);
        list.add(p3);

        //5、调用方法
        ArrayList<Phone> phoneInfoList = getPhoneInfo(list);

        //6、遍历集合
        for (int i = 0; i < phoneInfoList.size(); i++) {
            Phone phone = phoneInfoList.get(i);
            System.out.println(phone.getBrand() + "," + phone.getPrice());
        }

    }

    //4、设置方法，将价格低于3000的手机信息返回.
    //技巧:如果我们要返回多个数据，可以把这些数据先放到一个容器当中，再把容器返回
    //这个容器可以是一个集合，也可以是一个数组
    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list) {
        //、定义一个集合用于存储价格低于3000的手机对象
        ArrayList<Phone> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            //遍历集合
            Phone p = list.get(i);
            int price = p.getPrice();
            //如果当前的手机价格低于3000那么就把手机的对象添加到resultList当中就可以了
            if (price < 3000) {
                resultList.add(p);
            }
        }
        return resultList;
    }
}
