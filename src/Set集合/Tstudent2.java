package src.Set集合;

public class Tstudent2 implements Comparable<Tstudent2> {
    private String name;
    private int age;

    public Tstudent2() {
    }

    public Tstudent2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "name:" + name + ", age:" + age;
    }

    @Override
    //this:表示当前要添加的元素
    //o:表示已经在红黑树存在的元素

    //返回值
    //负数:表示当前要添加的元素是小的，存左边
    //正数:表示当前要添加的元素是大的，存右边
    //0:表示当前要添加的元素已经存在，舍弃
    public int compareTo(Tstudent2 o) {
        System.out.println("============");
        System.out.println("this:" + this);
        //指定排序的规则
        //只看年龄，我想要按照年龄的升序进行排列
        return this.getAge() - o.getAge();
    }
}
