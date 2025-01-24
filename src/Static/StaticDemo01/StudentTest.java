package src.Static.StaticDemo01;

public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName="X";
        //属性:姓名，年龄，性别
        //新增:老师姓名

        //1、创建第一个学生对象
        Student s1 = new Student();
        s1.setName("A");
        s1.setAge(20);
        s1.setGender("男老师");
        //s1.teacherName = "X";

        s1.study();
        s1.show();

        //2、创建第2个学生对象
        Student s2 = new Student();
        s2.setName("B");
        s2.setAge(30);
        s2.setGender("女老师");
       // s2.teacherName = "Y";
        s2.study();
        s2.show();
    }
}
