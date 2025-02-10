package src.oop.InnerClassDemo02;

public class Test {
    public static void main(String[] args) {
        /*
        编写成员内部类的注意点:
        1、成员内部类可以被一些修饰符修饰，比如:private 默认 protected public static 等
        2、在成员内部类时，JDK16之前不能定义静态变量，JDK16开始才可以定义静态变量

        获取成员内部类对象的两种方式:
        方式一:外部类编写方法，对外提供内部类对象
        方式二:直接创建
        格式:外部类名，内部类名  对象名=外部类对象，内部类对象;
        范例:Outer.Inner oi = new Outer().new Inner();
        */

        /*
        创建对象的方式、
        类名 对象名 = new 类名();
        Student s = new Student
         */

        /*
        我要创建的是内部类的对象

        Outer.Inner(表示我现在创建的这个对象是Outer这个外部类当中的Inner这个内部类对象)这就是等号左边的类名

         */


        /*
        Outer.Inner oi = new Outer().new Inner();
        new Outer()理解为外部类的对象，是一个调用者，调用后边的成员内部类的对象也就是(new Inner();)
        获取到这个new Inner()对象的地址值之后再赋值给变量oi
         */


        /*
        System.out.println(new Outer().name);
        为什么要这么去写?
        因为name是一个很成员变量，想要调用只能通过对象去调用
         */

        //获取内部类的对象
        //两种方法

        /*
        1、用object去接受
        Outer o = new Outer();
        Object inner = o.getInner();
         */

        //2、直接使用的方法去获取到对象
        Outer o = new Outer();
        System.out.println(o.getInner());
    }
}
