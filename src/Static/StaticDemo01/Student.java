package src.Static.StaticDemo01;

public class Student {
    //需求:写一个JavaBean类来描述这个班级的学生
    //属性:姓名、年龄、性别
    //行为:学习
    private String name;
    private int age;
    private String gender;
    public static String teacherName;

    public Student() {
    }

    public Student(int age, String gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //行为
    public void study() {
        System.out.println(name + "正在学习");
    }

    public void show() {
        System.out.println(name + "," + age + "," + gender + "," + teacherName);
    }
}
