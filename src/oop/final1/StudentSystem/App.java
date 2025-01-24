package src.oop.final1.StudentSystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作:1登录 2注册 3忘记密码");
            String choose = sc.next();
            switch (choose) {
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> forgetPassword(list);
                case "4" -> {
                    System.out.println("谢谢使用，再见");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    private static void forgetPassword(ArrayList<User> list) {
        System.out.println("忘记密码");
    }

    private static void register(ArrayList<User> list) {
        System.out.println("注册");
        //把用户添加到集合当中
        User user = new User();

        //1、键盘录入用户名
        Scanner sc = new Scanner(System.in);
        String username;
        while (true) {
            System.out.println("请输入用户名");
            username = sc.next();

            //定义一个方法
            boolean flag1 = checkUsername(username);
            if (flag1) {
                System.out.println("格式满足条件，继续判断用户名是否唯一");
                continue;
            }
            //校验用户名是否唯一
            //就是拿username到集合当中判断是否存在
            boolean flag2 = contains(list, username);
            if (flag2) {
                //用户名如果返回的结果是true，那么当前用户名无法注册，需要再重新输入
                System.out.println("用户已存在，请重新输入");
            } else {
                //不存在，表示当前用户名可用，可以继续录入下面的其他数据
                System.out.println("用户名" + username + "可用");
                break;
            }
        }

        //2、键盘录入密码
        //密码键盘输入两次，两次一致才可以注册
        String password;
        while (true) {
            System.out.println("请输入需要注册的密码");
            password = sc.next();
            System.out.println("请再次输入需要注册的密码");
            String againPassword = sc.next();
            if (!password.equals(againPassword)) {
                System.out.println("两次密码输入的不一致，请重新输入");
                continue;
            } else {
                System.out.println("两次密码一致，请继续录入其他数据");
                break;
            }
        }

        //3、键盘录入身份信息
        //长度为18位，不能是0开头的前17位必须是数字，最后一位可以是数字也可以是大写的X或者小写的x
        String personID;
        while (true) {
            System.out.println("请输入正确的身份证号码");
            personID = sc.next();
            boolean flag = checkpersonID(personID);
            if (flag) {
                System.out.println("身份证号码满足要求");
                break;
            } else {
                System.out.println("身份证号码格式有误请重新输入");
                continue;
            }
        }

        //4、键盘录入手机号码
        /*长度为11位
          不能以0开头
          必须都是数字*/
        String phoneNumber;
        while (true) {
            System.out.println("请输入手机号码");
            phoneNumber = sc.next();
            boolean flag = checkPhoneNuber(phoneNumber);
            if (flag) {
                System.out.println("手机号码格式正确");
                break;
            } else {
                System.out.println("手机号码格式有误，请出重新输入");
                continue;
            }
        }

        //用户名，密码，身份证号码，手机号码放到用户对象当中
        User u = new User(username, password, personID, phoneNumber);

        //把用户对象添加到集合里面
        list.add(u);
        System.out.println("注册成功");

        //验证是否真的注册成功，要遍历集合
        printList(list);
    }

    private static void printList(ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            //这里的i依旧表示索引
            User user = list.get(i);
            System.out.println(user.toString() + "," + user.getPassword() + "," + user.getPersonID() + "," + user.getPhoneNumber());

        }
    }

    private static boolean checkPhoneNuber(String phoneNumber) {
        //长度为11位
        if (phoneNumber.length() != 11) {
            return false;
        }
        //不能以0开头
        if (phoneNumber.startsWith("0")) {
            return false;
        }
        //必须都是数字
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (!(c >= '9' && c <= '9')) {
                return false;
            }
        }
//当循环结束之后，表示每一个字符都在0~9之间
        return true;
    }


    private static boolean checkpersonID(String personID) {
        //长度为18位
        if (personID.length() != 18) {
            return false;
        }
        // 不能是0开头的(也就是0索引位的字符不能是0开头的)
        boolean flage = personID.startsWith("0");//如果是0开头的方法会返回一个true如果不是就返回一个false
        if (flage) {
            //如果以0开头，那么返回false
            return true;
        }
        //前17位必须是数字
        for (int i = 0; i < personID.length() - 1; i++) {//因为要判断的是前17位所以要减一
            char c = personID.charAt(i);
            //如果有一个字符不在0~9之间，那么直接返回false
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        // 最后一位可以是数字也可以是大写的X或者小写的x
        char endChar = personID.charAt(personID.length() - 1);
        if ((endChar >= '0' && endChar <= '9') || (endChar >= 'x' && endChar <= 'X')) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean contains(ArrayList<User> list, String username) {
        //循环遍历集合得到每一个用户对象
        //拿着用户对象中的用户名进行比较
        for (int i = 0; i < list.size(); i++) {
            //i在这里还是表示集合当中的每一个索引
            User user = list.get(i);//使用get方法拿到每一个用户
            String rightUserNmae = user.getUsernamne();//表示集合里面的用户信息都是正确的意思
            if (username.equals(rightUserNmae)) {//拿着正确的用户名和正在查找的用户名来做一个比较
                return true;
            }
        }
        //当循环结束了，就表示集合里面的所有用户都比较完毕了，还没有一样的就返回false
        return false;
    }


    private static boolean checkUsername(String username) {
        //用户名长度必须要在3~15之间
        int len = username.length();
        if (len < 3 || len > 15) {
            return false;
        }
        //得到里面的每一个字符
        for (int i = 0; i < username.length(); i++) {
            //i表示索引
            char ch = username.charAt(i);//通过usernam调用charAt的方法来获取每一个字符
            //判断字符ch是不是在这里面呢  下面的方法就是当前的字符不在这三个范围之内就返回一个false (!就是取反的意思)
            if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'))) {
                return false;
            }
        }

        //当代码执行到这里，表示用户名的长度是符合要求的
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            //i表示索引
            char ch = username.charAt(i);//通过usernam调用charAt的方法来获取每一个字符
            //判断字符ch是不是在这里面?  下面的方法就是当前的字符不在这三个范围之内就返回一个false (!就是取反的意思)
            if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
                count++;
                break;//当有一个满足就直接break
            }
        }
        return count > 0;
    }

    private static void login(ArrayList<User> list) {
        System.out.println("登录");
        Scanner sc = new Scanner(System.in);

//输入用户名
        System.out.println("请输入用户名");
        String inputUsernam = sc.next();
        //查找用户是否存在
        User foundUser = null;
        for (User user : list) {
            if (user.getUsernamne().equals(inputUsernam)) {
                foundUser = user;
                break;
            }
        }
        if (foundUser == null) {
            System.out.println("用户名不存在，请先注册");
            return;
        }
        //输入密码
        System.out.println("请先输入密码");
        String inputPassword = sc.next();
        if (foundUser.getPassword().equals(inputPassword)) {
            System.out.println("登录成功");
        }else{
            System.out.println("密码错误，请重新输入");
        }
    }
    //生成验证码的方法，这里简单生成一个四位随机数字的验证码
    private static String getCode(){
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }
}


