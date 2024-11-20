package src.集合;

import java.util.ArrayList;

public class Test07对5和6进行合并 {
    public static void main(String[] args) {
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

        //4、查看id是否存在
        boolean falg = contains(list, "A");
        //5、打印结果
        System.out.println(falg);
    }

    public static boolean contains(ArrayList<User> list, String id) {
       /* for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String uId = u.getId();
            if (uId.equals(id)) {
                //如果找到了就直接返回true
                return true;
            }
        }
        //当前循环结束表示整个集合里面所有的元素都已经比较完毕，还没有一样的，那么直接返回flase就可以了
        return false;*/
        return getIndex(list, id) >= 0;
    }

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
