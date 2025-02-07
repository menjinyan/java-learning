package src.oop.abstact;

public class Student extends Person {
    public Student() {

    }

    public Student(String name, int age) {
        super(age, name);
    }

    @Override
    public void work() {
        System.out.println("学生的工作是学习");
    }
}
