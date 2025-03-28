package src.API.爬虫;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 有条件的爬取数据 {
    public static void main(String[] args) {
        /*
        有如下文本，请按照要求爬取数据。
Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长
期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台
需求1：爬取版本号为8,11,17的Java文本，但是只要Java，不显示版本号。
需求2：爬取版本号为8,11,17的Java文本。正确爬取结果为： Java8 Java11 Java17 Java17
需求3：爬取除了版本号为8,11,17的Java文本
         */

        String s = "java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长\n" +
                "期支持版本，下一个长期支持版本是JavA17，相信在未来不久Java17也会逐渐登上历史舞台";

        //1、定义正则表达式
        //?理解为前面的数据Java
        //=表示在Java后面要跟随的数据
        //但是在获取的时候，只获取前半部分

        //需求1:
        String regex1 = "(?i)Java(?=8|11|17)";

        //需求2:
        String regex2 = "(?i)Java(8|11|17)";
        String regex3 = "(?i)Java(?:8|11|17)";

        //需求3:
        String regex4 = "(?i)Java(?!8|11|17)";
        Pattern p = Pattern.compile(regex4);
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println(m.group());
            //打印结果为什么是四个Java呢？
            //因为第一个Java不符合人规则，而后面的四个全都符合
        }
    }
}
