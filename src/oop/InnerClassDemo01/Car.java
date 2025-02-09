package src.oop.InnerClassDemo01;

public class Car {
    String CarName;
    int CarAge;
    String CarColor;


    /*
           方法里有一个隐藏的this
           这个this什么时候有值，那就是当方法被调用的时候虚拟机会把调用者的值赋值给这个this，也就是调用c.show();
            */
    public void show(Car this) {
        //这行代码是打印调用者车的名字，也就是宾利
        System.out.println(CarName);//外部类可可以访问自己成员对象

        Engine e = new Engine();
        System.out.println(e.engineName);//但是不可以访问内部类的成员对象，如果要访问就要创建对象
    }


    class Engine {
        String engineName;
        int engineAge;

        public void show() {
            System.out.println("engineName"); //使用自己类里的成员变量没有问题
            System.out.println("CarName"); //使用外部的成员变量也没有问题，包括私有
        }
    }
}
