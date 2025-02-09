package src.oop.InterfaceDemo03;

public class InterImpl implements Inter1, Inter2 {
    @Override
    public void method1() {
        System.out.println("method1");
    }

    @Override
    public void method2() {
        System.out.println("method2");
    }

    @Override
    public void method3() {
        System.out.println("method3");
    }

    @Override
    public void method4() {
        System.out.println("method4");
    }
//如果多个接口中有重名的方法就只要重写一次就可以



   /* @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    @Override
    public void method4() {

    }

    @Override
    public void method5() {

    }

    @Override
    public void method6() {

    }*/
}
