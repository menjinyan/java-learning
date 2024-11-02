package src.StringBuilder;

public class StringBuilderDemo03链式编程 {
    public static void main(String[] args) {
        //1、创建对象
        StringBuilder s1 = new StringBuilder();

        //2、添加字符串
        s1.append("hello").append(" world").append("bbb");
        System.out.println(s1);

        //3、再把StringBuilder变回字符串
        String str = s1.toString();
        System.out.println(str);
    }
}
