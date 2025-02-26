package src.API.regex;

public class Demo04 {
    public static void main(String[] args) {
        // 必须是 数字 字母 下划线 至少 6位
        System.out.println("2345678frde234".matches("\\w{6,}"));//true
        System.out.println("23def".matches("\\w{6,}"));//false
        System.out.println("--------");
        //必须是数字和字母 必须是4位
        System.out.println("23d4".matches("[a-zA-Z0-9]{4,}"));//true
        System.out.println("23_f".matches("[a-zA-Z0-9]{4,}"));//false
        System.out.println("23Df".matches("[\\w&&[^_]]{4,}"));//true
        System.out.println("23_d".matches("[\\w&&[^_]]{4,}"));//false
    }
}
