package src.String;

public class StringDemo08反转字符串 {
    public static void main(String[] args) {
        String str="abc";
        reverser(str);
    }

    public static void reverser(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            System.out.print(ch);
        }
        return;
    }
}
