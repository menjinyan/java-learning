package src.oop.带有抽象结构的Javabean类;

public class Test {
    public static void main(String[] args) {
        //创建对象

        Frog f = new Frog(1, "小绿");
        System.out.println(f.getName() + "," + f.getAge());
        f.drink();
        f.eat();
    }
}
