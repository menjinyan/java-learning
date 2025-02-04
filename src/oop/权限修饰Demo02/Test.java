package src.oop.权限修饰Demo02;

import src.oop.权限修饰Demo01.Animal;

public class Test {
    public static void main(String[] args) {
        Animal a=new Animal();
        //System.out.println(a.name); 因为name是私有的，也会报错

        //结论1：私有只能在本类里面使用
        //结论2：在默认的情况下同一个类的其他包情况下也能用，但是在不同包下的子类是不能用的
        //结论3：protected(受保护的)在本类里面可以用，在本类里的其他类也可以用，在不同包下的子类也可以用，但是子类不可以用
        //结论4：public 都可以用
    }
}
