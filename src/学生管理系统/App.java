package src.学生管理系统;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作:1登录 2注册 3忘记密码");
            String choose=sc.next();
            switch (choose){
                case "1"-> System.out.println("登录");
                case "2"-> System.out.println("注册");
                case "3"-> System.out.println("忘记密码");
                case "4"->{ System.out.println("谢谢使用，再见");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }
}
