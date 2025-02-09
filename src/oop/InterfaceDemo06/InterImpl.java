package src.oop.InterfaceDemo06;

public class InterImpl implements Inter {
    @Override
    public void method() {
        System.out.println("InterImpl重写的抽象方法");
    }

    //不叫重写
    public static void show() {
        System.out.println("InterImpl重写的方法");

        /*
        什么叫重写:
        就是子类把父类中的虚方法表里面的方法进行覆盖，这才叫重写
        但是静态的、私有的、最终的、是不会添加到虚方法表里面的
         */
    }
}
