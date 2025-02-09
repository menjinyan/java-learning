package src.oop.InterfaceDemo08;

public class InterImpl extends InterAdapter {
    //我需要用到哪个方法就重写哪个方法就就可以了

    @Override
    public void method5() {
        System.out.println("只要用第5个方法");
    }
}
