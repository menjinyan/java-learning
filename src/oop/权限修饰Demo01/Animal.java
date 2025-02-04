package src.oop.权限修饰Demo01;

public class Animal {
   private String name; //在成员变量name前面加上一个private私有
   public void show(){
       System.out.println(name); //可以在本类里面打印name
   }

     //默认的情况(也就是空着不写)下在本类里面用是没有任何问题的，在同一个包的其他类当中也是没有任何问题的
     //protected(受保护的)在本类里面可以用，在本类里的其他类也可以用，在不同包下的子类也可以用
    //public 都可以用
}
