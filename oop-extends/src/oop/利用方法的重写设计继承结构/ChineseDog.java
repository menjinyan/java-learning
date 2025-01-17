package oop.利用方法的重写设计继承结构;

public class ChineseDog extends Dog {
    //父类中的方法不能满足我们需求了，所以需要重新写入
    //而且中华田园犬完全用不到父类中的代码，所以不需要通过super进行调用

    @Override
    public void eat() {
        System.out.println("吃剩饭");
    }
}
