package src.API.regex;

public class Demo05表达式的方法 {
    public static void main(String[] args) {

        //public String replaceSLL(String regex,String newStr)   按照正则表达式的规则进行替换
        //public String[] split(String regex)                    按照正则表达式的规则进行切割字符串

        /*
        有一段字符串，小时时dqwefqwfwq12312小丹丹dqwefqwfq12312小慧慧
        要求1:把字符串中三个姓名之间的字母替换为vs
        要求2:把字符串中的三个姓名切割出来
         */

        String s = "小时时dqwefqwfwq12312小丹丹dqwefqwfq12312小慧慧";

        //细节:
        //方法在底层的时候会和之前一样创建文本解析的对象
        //然后从头开始去读取字符串中的内容，只要有满足的，那么就用第二个参数去替换

        //String result = s.replaceAll("[\\w&&[^_]]+", "vs");
        //System.out.println(result);

        //小时时a小丹丹a小慧慧"
        String[] arr = s.split("[\\w&&[^_]]+");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
