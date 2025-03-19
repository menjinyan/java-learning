package src.suanfa01;

public class GirlFriend {

        /*
        要求1：属性有姓名、年龄、身高。
         */

    private String name;
    private int age;
    private double height;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public String toString() {
        return "GirlFriend [name=" + name + ", age=" + age + ", height=" + height + "]";
    }
}
