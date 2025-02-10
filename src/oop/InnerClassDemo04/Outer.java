package src.oop.InnerClassDemo04;

public class Outer {
    //int a = 10;
    //static int b = 20;

    //静态内部类
    static class Inner {
        public void show1() {
            //System.out.println("非静态的方法被调用了");
            /*
            注意事项里的内容
            //如果在内部类当中想要访问a，需要先创建外部类的对象
            Outer O = new Outer();
            System.out.println(O.a);
            System.out.println(b);
             */

            System.out.println("非静态方法被调用了");

        }

        public static void show2() {
            System.out.println("静态方法被调用了");


        }
    }
}
