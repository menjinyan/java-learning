package src.StringBuilder;

public class StringBuilderDemo01 {
    public static void main(String[] args) {
        //1、创建对象
        StringBuilder s1 = new StringBuilder("你好");
        //添加元素
        s1.append(1);
        s1.append(2.5);
        s1.append(true);
        //反转
        s1.reverse();
        //获取长度
        int len=s1.length();
        System.out.println(len);
        //打印
        System.out.println(s1);

        //普及:
        //因为StringBuider是Java已经写好的类
        //Java在底层对他做了一些特殊处理
        //打印的对象不是地址值而是属性
    }
}
