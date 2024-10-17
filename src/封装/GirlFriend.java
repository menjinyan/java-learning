package src.封装;

public class GirlFriend {
    //属性
    private String name;
    private int age;
    private String gender;

    //针对于每一个私有化的成员变量，都要提供get和set方法
    //set方法：给成员变量赋值（有参无返回的）
    //get方法：对外提供成员变量的值

    //Name的使用
    //set方法——作用：给成员变量name进行赋值的
    public void setName(String n) {
        name = n;
    }

    //get方法——作用：对外提供name属性
    public String getName() {
        return name;
    }

    //Age的使用
    //set方法——作用：给成员变量Age进行赋值的
    public void setAge(int a) {
        if (a >= 18 && a <= 50) {
            age = a;
        } else {
            System.out.println("非法参数");
        }
    }

    //get方法——作用：对外提供Age属性
    public int getAge() {
        return age;
    }

    //gender的使用
    //set方法——作用：给成员变量gender进行赋值的
    public void setGender(String g) {
        gender = g;
    }

    //get方法——作用：对外提供gender属性
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
//private修饰关键字，只能在本类中使用
