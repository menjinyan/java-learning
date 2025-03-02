package src.API.regex;

public class 捕获分组练习 {
    public static void main(String[] args) {
        /*
        需求:
        将字符串:我要学学编编编编程程程程程
        替换为:我要学编程
         */

        String str = "我要学学编编编编程程程程程";
        //学学       学
        //编编编编    编
        //程程程程程   程

        //(.) 表示把重复内容的第一个字符看做一组
        // \\1 表示第一个字符再次出现
        // + 至少一次
        //$1 表示把正则表达式中的第一组内容，再拿出来用
        String result = str.replaceAll("(.)\\1+", "$1");
        System.out.println(result);
    }
}
