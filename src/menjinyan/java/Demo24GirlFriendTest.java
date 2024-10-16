package src.menjinyan.java;

public class Demo24GirlFriendTest {
    public static void main(String[] args) {
        Demo23GirlFriend gf1 = new Demo23GirlFriend();
        //赋值
        gf1.setName("小诗诗");
        gf1.setAge(18);
        gf1.setGender("女");
        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());

        gf1.eat();
        gf1.sleep();
    }
}
