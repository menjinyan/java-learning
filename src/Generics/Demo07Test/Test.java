package src.Generics.Demo07Test;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        /**
         * 要求1:这方法能养所有品种的猫，但是不能养狗
         * 要求2:这方法能养所有品种的狗，但是不能养猫
         * 要求3：这方法能养所有品种的动物，但是不能养其他类型
         */

        ArrayList<PersianCat> list1 = new ArrayList<>();
        ArrayList<LiHuaCat> list2 = new ArrayList<>();
        ArrayList<TeddyDog> list3 = new ArrayList<>();
        ArrayList<HuskyDog> list4 = new ArrayList<>();

        keepPet(list1);

        keepPet(list2);

        keepPet(list3);

        keepPet(list4);
    }
    //要求1:这方法能养所有品种的猫，但是不能养狗
//public static void keepPet(ArrayList<? extends Cat> list) {}
//遍历集合，调用动物的eat方法

//要求2:这方法能养所有品种的狗，但是不能养猫
//public static void keepPet(ArrayList<? extends Dog> list) {}

    //要求3：这方法能养所有品种的动物，但是不能养其他类型
    public static void keepPet(ArrayList<? extends Animal> list) {
    }
}





