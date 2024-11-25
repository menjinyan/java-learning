package src.学生管理系统;

public class Student {
    private String id;
    private String name;
    private int age;
    private String address;

    public Student() {
    }

    public Student(String address, int age, String id, String name) {
        this.address = address;
        this.age = age;
        this.id = id;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
