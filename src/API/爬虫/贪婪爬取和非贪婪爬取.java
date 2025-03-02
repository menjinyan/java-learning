package src.API.爬虫;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 贪婪爬取和非贪婪爬取 {
    public static void main(String[] args) {
        /*
        有如下文本，请按照要求爬取数据。
Java自从95年问世以来，abbbbbbbbbbbbaaaaaaaaaaaaaaaaaa
经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长期支持版本，下一个长期
支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台

需求1：按照ab+的方式爬取ab，b尽可能多获取
需求2：按照ab+的方式爬取ab，b尽可能少获取

贪婪爬取:再爬取的数据的时候，尽可能多的获取数据
非贪婪爬取:在爬取的时候尽可能少的获取数据

ab+:
贪婪爬取:abbbbbbbbbbbb
非贪婪爬取:ab

在Java当中，默认的就是贪婪爬取，如果我们在数量词+*的后面加上问号，那么此时就是非贪婪爬取
         */
        String s = "Java自从95年问世以来，abbbbbbbbbbbbaaaaaaaaaaaaaaaaaa\n" +
                "经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长期支持版本，下一个长期\n" +
                "支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        String regex = "ab+?";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
