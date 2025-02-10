package src.oop.InnerClassDemo06;

public class Test1 {
    public static void main(String[] args) {
        //接口多态
        Swim s = new Swim() {
            @Override
            public void swim() {
                System.out.println("重写之后的游泳方法");
            }
        };

        //编译看左边，运行看右边的原则
        s.swim();
      new Swim() {
            @Override
            public void swim() {
                System.out.println("重写之后的游泳方法");
            }
        }.swim();
    }
}
