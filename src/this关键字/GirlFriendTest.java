package src.this关键字;

import src.封装.GirlFriend;

public class GirlFriendTest {
    public static void main(String[] args) {
        src.封装.GirlFriend girlFriend = new GirlFriend();
        //赋值
        girlFriend.setName("小诗诗");
        girlFriend.setAge(18);
        girlFriend.setGender("女");

        System.out.println(girlFriend.getName());
        System.out.println(girlFriend.getAge());
        System.out.println(girlFriend.getGender());
        girlFriend.eat();
        girlFriend.sleep();
    }
}
