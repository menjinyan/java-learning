package src.API.Integer;

public class Demo01 {
    public static void main(String[] args) {
        /*
        public Integer (int value)                             根据传递的整数创建一个integer对象
        public Integer (String s)                              根据传递的字符串创建一个Integer对象
        public static Integer valueOf(int i)                   根据传递的整数创建一个Integer对象
        public static Integer valueOf(String s)                根据传递的字符串创建一个Integer对象
        public static Integer valueOf(String s,int radix)      根据传递的字符串和进制创建一个Integer对象
         */

        //1、利用构造方法获取Integer对象(JDK5以前的方式)
        Integer i = new Integer(1);
        Integer i1 = new Integer("1");
        System.out.println(i);
        System.out.println(i1);
        System.out.println("----------");

        //2、利用静态方法获取Integer的对象(JDK5以前的方式)
        Integer i2 = Integer.valueOf(123);
        Integer i3 = Integer.valueOf("123");
        Integer i4 = Integer.valueOf("123", 8);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println("----------");


        //3、这两种方式获取对象的区别(掌握)
        //底层原理:
        //因为在Java开发当中，-128~127之间的数据，用的比较多
        //如果每次使用new对象，那么太浪费内存了
        //所以，提前把这个范围内的每一个数据都创建好对象
        //如果要用到了不会创建新的，而是返回已经创建好的对象
        Integer i5 = Integer.valueOf(127);
        Integer i6 = Integer.valueOf(127);
        System.out.println(i5 == i6);

        Integer i7 = Integer.valueOf(128);
        Integer i8 = Integer.valueOf(128);
        System.out.println(i7 == i8);

        //因为看到了new关键字，在Java当中，每一次new都是创建了一个新的对象
        //所以下面的两个对象都是new出来的，地址值不一样
        Integer i9 = new Integer(127);
        Integer i10 = new Integer(127);
        System.out.println(i9 == i10);

        Integer i11 = new Integer(128);
        Integer i12 = new Integer(128);
        System.out.println(i11 == i12);
    }
}
