package src.menjinyan.test;

public class Test16方法的内存 {
    public static void main(String[] args) {
        eat();
    }
    public static void eat() {
        studty();
        System.out.println("吃饭");
        sleep();
    }
    public static void sleep() {
        System.out.println("睡觉");
    }
    public static void studty() {
        System.out.println("学习");
    }
}
