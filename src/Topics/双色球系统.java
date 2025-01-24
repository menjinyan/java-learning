package src.Topics;

import java.util.Random;
import java.util.Scanner;

public class 双色球系统 {
    public static void main(String[] args) {
        //1、生成中奖号码
        int[] arr = createNumber();
        //2、用户输入彩票号码(红球+篮球的形式)
        int[] userInput = userInputNumber();
        for (int i = 0; i < userInput.length; i++) {
            System.out.print(userInput[i] + " ");
        }
    }

    public static int[] userInputNumber() {
        //1、创建数组用于添加用户购买的彩票号码
        //6个红球1个篮球，数组长度7
        int[] arr = new int[7];
        //2、利用键盘录入让用户输入
        Scanner sc = new Scanner(System.in);
        //让用户输入红球号码
        for (int i = 0; i < 6; i++) {
            System.out.println("请输入" + (i + 1) + "红球号码");
            int redNumber = sc.nextInt();
            //redNum 在1~33 唯一不重复
            if (redNumber >= 1 && redNumber <= 33) {
                boolean flage = contains(arr, redNumber);
                if (flage) {
                    //不存在
                    //有效的，可以添加到数组当中
                    arr[i] = redNumber;
                    i++;
                    //存在
                    System.out.println("当前红球号码已存在，请重新输入");
                } else {
                    System.out.println("当前的红球号码已经超出范围");
                }
            }
        }
        //让用户去输入篮球号码
        System.out.println("让用户去输入篮球号码");
        //1~16
        while (true) {
            int blueNumber = sc.nextInt();
            if (blueNumber >= 1 && blueNumber <= 16) {
                arr[arr.length - 1] = blueNumber;
                break;
            } else {
                System.out.println("当前篮球号码超出范围");
            }
        }
        return arr;
    }


    public static int[] createNumber() {
        //创建数组用于添加中奖号码
        //6个红色球1个白色球，数组长度：7
        int[] arr = new int[7];

        //2、随机生成号码并添加到数组中
        //红球：不能重复的 1 2 3 4 5 6
        //篮球：可以和红球的号码重复 比如：5
        //生成红球号码并添加到数组当中
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            //获取红球号码
            int redNumber = r.nextInt(33) + i;
            boolean flage = contains(arr, redNumber);
            if (!flage) {
                //把红球号码添加到数组当中
                arr[i] = redNumber;
                i++;
            }
        }
        //生成的篮球号码添加到数组当中
        int blueNumber = r.nextInt(16) + 1;
        arr[arr.length - 1] = blueNumber;
        return arr;
    }

    //判断数字在数组中是否存在
    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
