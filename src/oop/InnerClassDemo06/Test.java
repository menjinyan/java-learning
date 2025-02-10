package src.oop.InnerClassDemo06;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        /*
    匿名内部类代码格式:
    new 类名或者接口名(){
    重写方法;
    };
     */

        //编写匿名内部类代码
        new Swim() {
            @Override
            public void swim() {
                System.out.println("重写了游泳的方法");
            }
        };

        /*new Animal() {
            @Override
            public void eat() {
                System.out.println("重写了eat方法");
            }
        };*/

        method(
                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("狗吃骨头");
                    }
                }
        );
    }

    public static void method(Animal a) {
        a.eat();
    }
}

