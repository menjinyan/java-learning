package src.oop.InterfaceDemo05;

/*
   接口中默认的方法的定义格式:
   格式:public default 返回值；类型，方法名(参数列表){}

   接口中默认的注意事项
   1、默认方法不是抽象对象，所以不强制被重写，重写的时候去掉default关键字
   2、public 可以省略，defult不能省略
   3、如果实现了多个接口，多个接口中存在的相同名字的默认方法，子类就必须对该方法进行重写
     */
public class Test {
    public static void main(String[] args) {
        //创建实现类对象
        InterImpl ii = new InterImpl();
        /*ii.method();*/
        ii.show(); //重写之后的show方法
    }
}
