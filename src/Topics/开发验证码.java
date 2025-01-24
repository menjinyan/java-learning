package src.Topics;

import java.util.Random;

public class 开发验证码 {
    public static void main(String[] args) {
        /*需求:
        定义方法实现随机产生的一个5位的验证码
        格式为:长度为5 前四位是大写字母或者小写字母 最后一位是数字
         */

        //方法:
        //A~Z or a~z 有什么规律?
        //在以后如果我们要在一堆没有什么规律的数据中随机抽取
        //可以先把这些数据放到数组中
        //再随机抽取一个索引

        //分析:
        //1、大写字母和小写字母都放到数组中
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            //ASCLL码表
            if (i <= 25) {
                //添加小写字母
                chs[i] = (char) (97 + i);
            } else {
                //添加大写字母
                //在ASCLL表中大写的A对应的字母是65
                chs[i] = (char) (65 + i - 26); //为什么-26:因为当i在0~25的范围之内是添加的小写字母，当i是26的时候才开始添加大写字母这个时候拿65+26的话再转为char就不是大写的A了苏所以65+26再-26还是65那么65强转为char就是大写的A
            }
        }
        ;//分析:一开始i是0所以97+i还是等于97 第二次是i++所以就是98.
        //遍历
        for (int i = 0; i < chs.length; i++) {
            System.out.print(chs[i] + "");
        }
        //定义一个字符串的变量来记录最终的结果
        String result = "";
        //2、随机抽取4次
        //随机抽取数组中的索引
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            //利用随机索引，获取对应的元素
            System.out.println(chs[randomIndex]);
            result = result + chs[randomIndex];
        }

        //3、随机抽取一个数字0~9之间的范围
       int number= r.nextInt(10);
        //最终的结果
       result= result+number;
       //打印最终的结果
        System.out.println(result);
    }
}
//若不会，看75集