package Demo01;

public class Test {
    public static void main(String[] args) {

        //创建三个对象并调用register方法
        Student s = new Student();
        s.setName("小明");
        s.setAge(23);

        Teacher t = new Teacher();
        t.setName("李四");
        t.setAge(25);

        Adminstracter A = new Adminstracter();
        A.setName("张华");
        A.setAge(27);

        register(s);
        register(t);
        register(A);
    }


    //我想要这个方法既能接收方法还能接收学生还能接收管理员
    //只能把参数写三个类型的父类
    public static void register(Person p) {
        p.show();
    }
}
