package src.API.regex;

public class Demo01 {
    /*
    假如现在要验证一个QQ号码是否正确
    规则:6位及20位之内，0不能在开头，必须全是数字
    先使用目前所学知识完成校验需求
    然后体验一下正则表达式检验

    核心思想:
    先把异常数据进行过滤
    下面就是满足要求的数量了

     */
    public static void main(String[] args) {
       String qq = "1234567890";
        //System.out.println(checkqq(qq));
        System.out.println(qq.matches("[1-9]\\d{5,19}]]"));//正则表达式
    }

    public static boolean checkqq(String qq) {
        //规则:6位及20位之内，
        int len = qq.length();
        if (len < 6 || len > 20) {
            return false;
        }
        //0不能在开头，
        if (qq.startsWith("0")) {
            return false;
        }
        //必须全是数字
        for (int i = 0; i < qq.length(); i++) {
            char c = qq.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
