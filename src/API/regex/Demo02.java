package src.API.regex;

public class Demo02 {
    public static void main(String[] args) {
        //public boolean matches(String regex):判断是否与正则表达式匹配，匹配返回true

        //只能是a b c
        System.out.println("---1---");
        System.out.println("a".matches("[abc]"));//true
        System.out.println("z".matches("[abc]"));//false
        System.out.println("ab".matches("[abc]"));//false,为什么也是false，因为有连个，但是在大括号的内容当中只能出现一个
        System.out.println("ab".matches("[abc][abc]"));//true

        //不能出现a b c
        System.out.println("---2---");
        System.out.println("a".matches("[^abc]"));//false  含义:就是问a是不是不在abs里面，所以是错的
        System.out.println("z".matches("[^abc]"));//true
        System.out.println("zz".matches("[^abc]"));//false
        System.out.println("zz".matches("[abc][^abc]"));//false

        // a ~ z  A ~ Z (包含头尾的范围)
        System.out.println("---3---");
        System.out.println("a".matches("[a-zA-Z]"));//true
        System.out.println("z".matches("[a-zA-Z]"));//true
        System.out.println("aa".matches("[a-zA-Z]"));//false
        System.out.println("zz".matches("[a-zA-Z]"));//false
        System.out.println("zz".matches("[a-zA-Z][a-zA-Z]"));//true
        System.out.println("0".matches("[a-zA-Z]"));//false
        System.out.println("0".matches("[a-z0-9]"));//true

        //[a-d[m-p]] a ~ d or m ~ p
        System.out.println("---4---");
        System.out.println("a".matches("[a-d[m-p]]"));//true
        System.out.println("d".matches("[a-d[m-p]]"));//true
        System.out.println("m".matches("[a-d[m-p]]"));//true
        System.out.println("p".matches("[a-d[m-p]]"));//true
        System.out.println("o".matches("[a-d[m-p]]"));//true
        System.out.println("q".matches("[a-d[m-p]]"));//false


        // [a-z && [m-p]]  a ~ z和def的交集 为:d,e,f
        //细节:
        //如果要求两个范围的交集，那么需要写符号&&
        //如果写成了一个& ，那么就不是表示交集了，就是一个简单的&符号
        System.out.println("---5---");
        System.out.println("a".matches("[a-z&&[def]]"));//false 含义:问a是不是a~z范围内的def
        System.out.println("d".matches("[a-z&&[def]]"));//true
        System.out.println("0".matches("[a-z&&[def]]"));//false

        // [a~z&&[^bc]]  a~z和非bc的交集,(等同于[a or d-z])
        System.out.println("---6---");
        System.out.println("a".matches("[a-z&&[^bc]]"));//true
        System.out.println("b".matches("[a-z&&[^bc]]"));//false
        System.out.println("0".matches("[a-z&&[^bc]]"));//false

        //[a-z&&[^m-p]]  a和z和除了m到p的交集,(邓等同于[a-lq-z])
        System.out.println("---7---");
        System.out.println("a".matches("[a-z&&[^m-p]]"));//true
        System.out.println("m".matches("[a-z&&[^m-p]]"));//false
        System.out.println("0".matches("[a-z&&[^m-p]]"));//false
    }
}
//