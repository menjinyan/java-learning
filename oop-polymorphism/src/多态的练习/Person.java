package 多态的练习;

public class Person {
   /* 3.定义Person类//饲养员
    属性:
    姓名，年龄
    行为:
    keepPet(Dog dog,String something)方法
    功能:喂养宠物狗，something表示喂养的东西
    行为:
    keepPet(cat cat,String something)方法
    功能:喂养宠物猫，something表示喂养的东西
    生成空参有参构造，set和get方法
4.定义测试类(完成以下打印效果):
    keepPet(Dog dog,String somethind)方法打印内容如下:
    年龄为30岁的老王养了一只黑颜色的2岁的狗
2岁的黑颜色的狗两只前腿死死的抱住骨头猛吃
    keepPet(Cat cat,String somethind)方法打印内容如下:
    年龄为25岁的老李养了一只灰颜色的3岁的猫
3岁的灰颜色的猫眯着眼睛侧着头吃鱼 */

    private String name;
    private int age;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*keepPet(Dog dog,String somethind)方法打印内容如下:
    年龄为30岁的老王养了一只黑颜色的2岁的狗
2岁的黑颜色的狗两只前腿死死的抱住骨头猛吃
    keepPet(Cat cat,String somethind)方法打印内容如下:
    年龄为25岁的老李养了一只灰颜色的3岁的猫
3岁的灰颜色的猫眯着眼睛侧着头吃鱼 */

    //饲养狗
    /*public void keepPet(Dog dog, String somethind) {
        System.out.println("年龄为" + age + "岁的" + name + "养了一只" + dog.getColor() + "颜色的" + dog.getAge() + "岁的狗");
        dog.eat(somethind);
    }

    //饲养猫
    public void keepPet(Cat cat, String somethind) {
        System.out.println("年龄为" + age + "岁的" + name + "养了一只" + cat.getColor() + "颜色的" + cat.getAge() + "岁的猫");
        cat.eat(somethind);
    }*/

    //想要一个方法能接受所有的动物，包括猫和狗
    //方法的形参:可以写这些类的父类也就是Animal

    public void keepPet(Animal a, String somethind) {
        if (a instanceof Dog d) {
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + d.getColor() + "颜色的" + d.getAge() + "岁的狗");
            d.eat(somethind);
        } else if (a instanceof Cat c) {
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + c.getColor() + "颜色的" + c.getAge() + "岁的猫");
            c.eat(somethind);
        } else {
            System.out.println("没有这种动物");
        }


    }
}
