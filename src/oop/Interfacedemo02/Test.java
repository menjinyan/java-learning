package src.oop.Interfacedemo02;


import java.util.Scanner;

/*
成员变量:
   只能是常量，默认修饰符:Public static final

构造方法
    没有

成员方法:
    只能是抽象方法，默认修饰符:public abstract
 */
public class Test {
    public static void main(String[] args) {
        // System.out.println(Inter.a);表示就用static修饰的

        //创建实现类对象并调用方法
        InterImpl ii = new InterImpl();
        ii.method();

        Scanner sc=new Scanner(System.in);
        sc.next();
    }
}
