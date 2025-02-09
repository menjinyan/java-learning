package src.oop.InterfaceDemo05;

public interface InterB {
    public default void show() { //如果default没有2写java就会默认这是一个抽象的方法
        System.out.println("InterB接口中的默认方法 --- show");
    }
}
