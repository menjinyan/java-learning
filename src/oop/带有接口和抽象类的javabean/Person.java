package src.oop.带有接口和抽象类的javabean;


//因为现在我不想让外界去直接创建人的对象
//因为直接创建顶层父类的人的对象是没有意义的
//所有我就把他写为抽象的

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
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
