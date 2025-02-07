package src.oop.abstact;

public class Test {
    public static void main(String[] args) {
        //创建对象
        //Person p =new Person();

        Student s = new Student(23, "zhangsan");
        System.out.println(s.getName() + "," + s.getAge());
    }
}
