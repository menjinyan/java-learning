package src.API.Object;

public class Demo04 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //protected Object clone(int a)        对象克隆

        //1、如果想要对象克隆，要先创建一个对象
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0};
        User u1 = new User(1, "zhangsan", "1234qcwer", "girl", data);


        //2、克隆对象
        //细节:
        //方法在底层会帮我们创建一个对象，并把原对象中的数据拷贝过去
        //书写细节:
        //1、重写Object中的clone方法
        //2、让javabean类实现Cloneable接口
        //3、创建原对象并调用clone就可以
        //Object u2 = (User) u1.clone();//因为现在克隆的是一个用户对象所以需要强转
        //System.out.println(u1);
        //System.out.println(u2);

        User u2 = (User) u1.clone();
        //验证Object中的克隆是浅克隆
        int[] arr = u1.getData();
        arr[0] = 100;
        System.out.println(u1);
        System.out.println(u2);
        //如果运行的结果跟着改了那就是浅克隆，如果没有跟着改那就是深克隆，所以验证结果就是浅克隆

        //在User中修改之后就是深克隆
    }
}
