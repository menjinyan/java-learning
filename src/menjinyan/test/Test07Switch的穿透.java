package src.menjinyan.test;

import java.util.Scanner;

public class Test07Switch的穿透 {
    public static void main(String[] args) {
        //switch中的case穿透
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个数表示星期");
//        int week=sc.nextInt();
//        switch  (week){
//            case 1,2,3,4,5:
//                System.out.println("工作日");
//                break;
//            case 6,7:
//                    System.out.println("休息日");
//                    break;
//            default:
//            System.out.println("没有");
//            break;
//        }
        //或者
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数表示星期");
        int week=sc.nextInt();
        switch  (week) {
            case 1, 2, 3, 4, 5 -> System.out.println("工作日");
            case 6, 7 -> System.out.println("休息日");
            default -> System.out.println("没有");
        }
    }
}
