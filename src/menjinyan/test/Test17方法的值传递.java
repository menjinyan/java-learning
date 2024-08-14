package src.menjinyan.test;

public class Test17方法的值传递 {
    public static void main(String[] args) {
        int number=100;
        System.out.println("调用change方法前:"+number);//100
        change(number);
        System.out.println("调用change方法后:"+number);
    }
    public static void change(int number){
        number=200;
    }
}
//为什么是这样呢？
//注意：可以用方法传递基本数据类型的内存原理解释，如下。
/*
public class ArgsDemo01{
    public static void main(String[] args) {
        int number=100;
        sout("调用change方法前:"+number);
        change(number);
        sout("调用change方法后:"+number);
    }
    public static void change(int number){
        number=200;
    }
}
原理解释：一开始是main()方法进栈,然后从main方法的第一行逐行往下开始执行代码
int number=100; 调用change方法前打印出来的就是100
change(number); chang方法里的number也是100，此时chang number的数改为200那么chang number也就等于200
那么chang方法就调用完毕可以出栈了（因为变量是有作用范围的，它只在所属的方法里有效）
回头再次调用main方法 sout里的调用chang方法也还是100
打印之后main方法里的所有程序也就执行完毕了，main 方法也要出栈


得出的结论：传递基本数据类型的时候，传递的真实的数据，形参的改变，不影响实际参数的值

如果想让main方法里的number变为200应该如何改变呢
public class ArgsDemo01{
    public static void main(String[] args) {
        int number=100;
        sout("调用change方法前:"+number);
           number=change(number);
        sout("调用change方法后:"+number);
    }
    public static int change(int number){
        number=200;
        return nimber;
    }
}
解释：就是把修改完之后的nuber返回给chang number里，也就是还回给调用处
 */