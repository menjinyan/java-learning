package src.oop.InterfaceDemo07;

public interface InterA {
    public default void show1() {
        System.out.println("show1方法开始执行了");
        show3();  //这个时候show1就可以直接调用show3方法
    }

    public default void show2() {
        System.out.println("show2方法开始执行了");
        show3();  ////这个时候show2就可以直接调用show3方法
    }

    private void show3() {
        /*
        如果带有public default,会被外界直接调用
        加上Private并删除default就变为了普通的私有化方法，给默认方法服务的
         */
        System.out.println("记录程序在运行过程中各种细节，这里有100行代码");
        ;
    }

    //静态的私有方法，给静态的方法进行服务的
    private static void show4() {
        System.out.println("记录程序在运行过程中各种细节，这里有100行代码");
    }
}
