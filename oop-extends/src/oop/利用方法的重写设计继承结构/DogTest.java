package oop.利用方法的重写设计继承结构;

public class DogTest {
    public static void main(String[] args) {
        //创建对象并调用
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.LookHome();
        h.brakhomes();

        ChineseDog cd = new ChineseDog();
        cd.eat();
        cd.drink();
        cd.LookHome();

    }
}
