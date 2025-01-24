package src.oop.利用方法的重写设计继承结构;

public class SharPei extends Dog {
    //因为沙皮狗吃的是狗粮和骨头所以需要进行重写

    @Override
    public void eat() {
        super.eat();
        System.out.println("狗啃骨头");
    }
}
