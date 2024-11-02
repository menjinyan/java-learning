package src.StringBuilder;

public class StringBuilderDemo02 {
    public static void main(String[] args) {
        //创建对象
        StringBuilder s2 = new StringBuilder();

        //2、添加字符串
        s2.append("Hello");
        s2.append("!");
        s2.append("World");
        System.out.println(s2);

        //3、再把StringBuilder变回字符串
        String str=s2.toString();
        System.out.println(str);
        //用toString方法变回字符串
    }
}
