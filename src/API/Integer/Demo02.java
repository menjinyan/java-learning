package src.API.Integer;

public class Demo02 {
    public static void main(String[] args) {
        /*
        在JDK5之后提出了一个机制:自动装箱自动拆箱
        自动装箱:把基本数据类型会自动的变成其他对应的包装类
        自动拆箱:把包装类自动的变成其对象的基本数据类型
         */

        //自动装箱
        Integer i1=10;

        //自动拆箱
        Integer i2 = Integer.valueOf(10);
        int i=i2;

        //再JDK5以后，int和Integer可以看作是同一个东西，因为再内部可以自动转化
    }
}
