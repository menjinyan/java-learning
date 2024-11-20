package src.集合;

import java.util.ArrayList;

public class Test06添加用户对象并判断用户对象是否存在的变形题 {
    public static void main(String[] args) {
        // 需求:
        //1，main方法中定义一个集合，存入三个用户对象。用户属性为:id，username，password
        //2，要求:定义一个方法，根据id查找对应的用户信息。如果存在，返回索引
        //如果不存在，返回-1
        //1、创建集合
        ArrayList<User> list = new ArrayList<>();

        //2、创建三个用户对象
        User u1 = new User("A", "123456", "menjinyan");
        User u2 = new User("B", "123456", "chenyixun");
        User u3 = new User("C", "123456", "xuezhiqian");

        //3、把用户添加到集合当中
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //4、查找索引
        int index = getIndex(list, "A");

        //5、输出打印
        System.out.println(index);
    }

    //此时的返回值不能是boolean了因为是索引所以要定义为Int
    public static int getIndex(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            String uid = user.getId();
            if (id.equals(uid)) {
                return i;
            }
        }
        return -1;
    }
}
