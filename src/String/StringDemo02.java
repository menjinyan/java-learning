package src.String;

public class StringDemo02 {
    public static void main(String[] args) {
        //1、创建两个字符串的对象
        String s1 = new String("abc");
        String s2 = "abc";

        //2、==号比较
        //基本数据类型，比的是数据值
        //引用数据类型，比的是地址值
        System.out.println(s1 == s2);

        //3、比较字符串对象中的内容是否相等
        boolean result = s1.equals(s2);
        System.out.println(result);

        //4、比较字符串对象中的内容是否相等，忽略大小写(忽略大小写只能是英文状态下的)
        boolean result2 = s1.equalsIgnoreCase(s2);
        System.out.println(result2);
    }
}
