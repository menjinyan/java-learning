package oop.带有继承结构的javabean类;

/*1、经理:
成员变量:工号，姓名，工资，管理奖金
成员方法:工作(管理其他人)，吃饭（吃米饭）

2、厨师
成员变量:工号，姓名，工资
成员方法:工作(炒菜)，吃饭(吃米饭)

 */
public class Employee {
    private String id;
    private String name;
    private int salary;

    public Employee() {
    }

    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //工作
    public void work() {
        System.out.println("我在努力敲代码");
    }

    //吃饭
    public void eat() {
        System.out.println("我在吃饭");
    }
}
