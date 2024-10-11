package Topics;

import java.util.Random;

public class 抢红包 {
    public static void main(String[] args) {
        //需求:
        //分别有(2,588,888,1000,10000)
        //请使用代码模拟抽奖，打印每个奖项，奖项的出现顺序要随机不重复

        //1、把奖池里所有的奖项打乱顺序
        int[] arr = {2, 588, 888, 1000, 10000};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //获取随机索引
            int randomIndex = r.nextInt(arr.length);
            //拿着i跟随主机上的值进行交换
            int temp = arr[i];
            arr[randomIndex] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        //2、遍历奖池,从0索引开始获取每一个奖项
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
