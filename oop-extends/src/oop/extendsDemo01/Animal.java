package oop.extendsDemo01;

public class Animal {
    //权限修饰符:
    //private:子类就无法访问了
    //私有:只能在本类中进行访问


    //注意事项
    //子类中只能访问父类中非私有的成员
    public void eat() {
        System.out.println("吃东西");
    }

    public void drink() {
        System.out.println("喝水");
    }
}