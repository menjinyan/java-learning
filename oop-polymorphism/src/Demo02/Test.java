package Demo02;


public class Test {
    public static void main(String[] args) {

        //创建对象
        Animal a = new Dog();
        //编译看左边运行看右边
        a.eat();

        //多态的弊端
        //不能去调用类的特功能
        //当调用成员方法的时候，编译看左边运行看右边
        //那么在编译的时候就会先检查右边有没有这个方法，如果没有直接报错

        //解决方案
        //变回子类类型就可以了(也就是强制转换)
        //细节:转换的时候不能瞎转换，如果转换成其他类型就会报错
        //Cat c=(Cat)a;
        //c.catchMose();

        /*if (a instanceof Dog) {
            Dog d = (Dog) a;
            d.lookhome();
        } else if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.catchMose();
        } else {
            System.out.println("没有这个类型无法转换");
        }*/

        //新特性（就是可以把哦、判断和强转合在一起写，不用和上面一样麻烦）
        //先判断a是否为Dog类型，如果是，则强制转换为Dog类型，转换之后变量名为d
        //如果不是则不强转，结果直接是fale
        if (a instanceof Dog d) {
            d.lookhome();
        } else if (a instanceof Cat c) {
            c.catchMose();
        } else {
            System.out.println("没有这个类型无法转换");
        }
    }
}

class Animal {
    public void eat() {
        System.out.println("动物在吃东西");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗在啃骨头");
    }

    public void lookhome() {
        System.out.println("狗在看家");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫在吃小鱼干");
    }

    public void catchMose() {
        System.out.println("猫抓老鼠");
    }
}