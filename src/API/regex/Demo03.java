package src.API.regex;

public class Demo03 {
    public static void main(String[] args) {
        // 在Java当中 \ 代表转义字符，就是改变后面那个字符原本的含义

        //练习:要求以字符串的形式打印一个双引号

        //在Java当中“”代表的是字符串的开头或结尾
        //此时 \ 表示转义字符，改变了后面那个双引号原本的含义
        //把他变成了一个普普通通的双引号
        // 如果是 \\ 前面的表示转义字符 改变了后面原本的含义，把他变成一个普普通通的 \ 而已
        System.out.println("\"");

        // . 表示任意一个字符
        System.out.println("你".matches(".."));//false
        System.out.println("你".matches("."));//true
        System.out.println("你a".matches(".."));//true
        System.out.println("----1----");

        // \d 表示的任意一个数字
        // \\d 只能是任意的一位数
        //简单来记 //表示一个/
        System.out.println("a".matches("\\d"));//false
        System.out.println("2".matches("\\d"));//true
        System.out.println("222".matches("\\d"));//false
        System.out.println("333".matches("\\d\\d\\d"));//true
        System.out.println("----2----");

        // \\w只能是一位单词字符[a-zA-Z_-09]
        System.out.println("z".matches("\\w"));//true
        System.out.println("2".matches("\\w"));//true
        System.out.println("22".matches("\\w"));//false
        System.out.println("你".matches("\\w"));//false
        System.out.println("_".matches("\\w"));//true
        System.out.println("----3----");

        //非单词字符 w要大写(W)
        System.out.println("你".matches("\\W"));//true
        System.out.println("以上正则表达式只能校验单个字符");
    }
}
