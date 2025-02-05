package src.oop.静态代码块;

public class Student {
    private String name;
    private int age;

    //执行时机
    //随着类的加载而加载，并且只执行一次
    static {
        System.out.println("静态代码块执行了");
    }

    public Student() {
        System.out.println("空参构造");
    }

    public Student(int age, String name) {
        System.out.println("有参构造");
        this.age = age;
        this.name = name;
    }

    //添加接收一个 String 类型参数的构造方法
    public Student(String name) {
        System.out.println();
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

