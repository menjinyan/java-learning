package src.API.Objects;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String namer, int age) {
        this.name = namer;
        this.age = age;
    }

    public String getNamer() {
        return name;
    }

    public void setNamer(String namer) {
        this.name = namer;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //重写之后的equals方法进行比较的就是对象内部的属性值了

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public String toString() {
        return "Student{name+" + name + ",age=" + age + "}";
    }
}
