package Topics;

import java.util.Scanner;

public class 评委打分 {
    public static void main(String[] args) {
        //需求:
        //有6位评委给选手打分，分数范围是[0~100]之间的整数，选手的最后的得分为:去掉最高分和最低分后的四个评委打的平均分。

        //分析:
        //1、定义一个数组，用来存储6名评委的打分(0~100)
        int[] scoreArr = getScores();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println(scoreArr[i]);
        }
        //2、求出数组中的最大值
        int max = getMax(scoreArr);
        //3、求出数组中的最小值
        int min = getMin(scoreArr);
        //4、求出数组中6个分数的总和
        int sum = getsum(scoreArr);
        //5、(总和 -最大值-最小值)/4
        int avg = (sum - max - min) / (scoreArr.length - 2);
        System.out.println("选手的最终得分为:" + avg);
    }

    public static int getsum(int[] scoreARR) {
        int sum = 0;
        for (int i = 0; i < scoreARR.length; i++) {
            sum += scoreARR[i];
        }
        return sum;
    }

    //求出数组中的最大值:
    public static int getMax(int[] scoreARR) {
        int max = scoreARR[0];
        for (int i = 1; i < scoreARR.length; i++) {
            if (scoreARR[i] > max) {
                max = scoreARR[i];
            }
        }
        return max;
    }

    //求出数组中的最小值
    public static int getMin(int[] scoreARR) {
        int min = scoreARR[0];
        for (int i = 1; i < scoreARR.length; i++) {
            if (scoreARR[i] < min) {
                min = scoreARR[i];
            }
        }
        return min;
    }

    public static int[] getScores() {
        //定义数组
        int[] Scores = new int[6];
        //使用键盘录入的形式，输入分数:(0~100)
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < Scores.length; ) {
            System.out.println("请输入评委的打分");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                Scores[i] = score;
                i++;
            } else {
                System.out.println("成绩超出了范围，继续录入,当前的i为:" + i);
            }
        }
        return Scores;
    }
}
