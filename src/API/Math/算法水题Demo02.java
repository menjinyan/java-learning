package src.API.Math;

public class 算法水题Demo02 {
    public static void main(String[] args) {
       /*
       自幂数:一个n位自然数等于自身各个数位上数字的n次幂之和
        举例:三位数 1^3+5^3+3^3=153  (也就是1的三次方+ 5的三次方+ 3的三次方，如果这个结果和本身是一样的那么就是自幂数)
        举例:四位数 1^4+6^4+3^4++4^3=1634
        如果自幂数是一位数就叫做:独身数
        三位数 水仙花数  四位数  四叶玫瑰数
        五位数 五角星数  六位数  六合数
        七位数 北斗七星数  八位数  八仙数
        九位数 九九重阳数  十位数  十全十美数


        要求1:统计一共有多少个水仙花数
        水仙花数是:100~999之间
        */

        //得到每一个三位数
        int count = 0;
        for (int i = 100; i <= 999; i++) {

            //在循环里得到每一数的个位 十位 百位
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;

            //进行判断
            //每一位的三次方之和，和本身进行比较
            double sum = Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3);
            //判断他们地和sum和数字 i 是不是相等的
            if (sum == i) {
                count++;
                //System.out.println(i);
            }
        }
        System.out.println(count);
    }
}
