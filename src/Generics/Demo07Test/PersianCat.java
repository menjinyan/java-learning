package src.Generics.Demo07Test;

public  class PersianCat extends Cat {
    @Override
    public void eat() {
        System.out.println("一只叫做"+getName()+"的."+getAge()+"岁的波斯猫，正在吃蛋糕");
    }
}
