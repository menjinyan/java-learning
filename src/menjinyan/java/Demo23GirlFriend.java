package src.menjinyan.java;

public class Demo23GirlFriend {
    //属性
    private String name;
    private int age;
    private String gender;
    private String eat;
    private String sleep;

    //针对每一个私有化的成员变量，都要提供get和set方法
    //set方法：给成员变量赋值
    //get方法：对外提供成员变量的值

    //作用：给成员白能力进行赋值
    public void setName(String name) {
        name = name;
    }

    //作用：对外提供name属性的
    public String getName() {
        return name;
    }

    //age
    //setAge:给成员变量age进行赋值的
    //getAge：对外提供成员变量age的值
    public void setAge(int a) {
        if (a > 18 && a < 50) {
            age = a;
        } else {
            System.out.println("错误参数");
        }
    }

    public int getAge() {
        return age;
    }

    //gender
    public void setGender(String g) {
        gender = g;
    }
    public String getGender() {
        return gender;
    }

    //行为
    public void sleep() {
        System.out.println("女朋友在睡觉");
    }

    public void eat() {
        System.out.println("女朋友在吃饭");
    }
}
//private关键字只能在本类中使用