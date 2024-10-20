package src.面向对象this关键字;

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
        //局部变量变量表述测试类中1调用方法传递过来的数据
        //等号的左边等于成员位置的name。
        this.name = n;
    }

    //get方法——作用：对外提供name属性
    public String getName() {
        return name;
    }

    //Age的使用
    //set方法——作用：给成员变量Age进行赋值的
    public void setAge(int age) {
        if (age >= 18 && age <= 50) {
            this.age = age;
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
    public void setGender(String gender) {
        this.gender = gender;
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

