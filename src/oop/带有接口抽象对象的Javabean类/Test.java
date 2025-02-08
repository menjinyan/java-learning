package src.oop.带有接口抽象对象的Javabean类;


public class Test {
    public static void main(String[] args) {
        //创建青蛙对象
        Frog f = new Frog(1, "小蛙");
        System.out.println(f.getName() + "," + f.getAge());
        f.eat();
        f.swim();

        //创建兔子对象
        Rabbit r = new Rabbit(1, "小白");
        System.out.println(r.getName() + "," + r.getAge());
        r.eat();

    }
}
