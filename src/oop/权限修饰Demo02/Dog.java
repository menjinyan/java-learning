package src.oop.权限修饰Demo02;

import src.oop.权限修饰Demo01.Animal;

public class Dog extends Animal {

    public void show() {
       // System.out.println(name);//在其他包里的子类也是用不了的
        //如果想用就要在name里提供一个公共的方法

        //结论1：私有只能在本类里面使用
        //结论2：在默认的情况下同一个类的其他包情况下也能用，但是在不同包下的子类是不能用的
        //结论4：public 都可以用
    }
}
