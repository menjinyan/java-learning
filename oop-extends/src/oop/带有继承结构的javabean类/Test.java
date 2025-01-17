package oop.带有继承结构的javabean类;

public class Test {
    public static void main(String[] args) {
        //创建对象并赋值调用
        Manager m = new Manager("001", "menjinyan", 1000, 8000);
        System.out.println(m.getId() + "," + m.getName() + "," + m.getSalary() + "," + m.getBouns());

        m.eat();
        m.work();

        Cook c=new Cook();
        c.setId("002");
        c.setName("menjinyan");
        c.setSalary(1000);
        System.out.println(c.getId() + "," + c.getName() + "," + c.getSalary());
        c.eat();
        c.work();
    }
}
