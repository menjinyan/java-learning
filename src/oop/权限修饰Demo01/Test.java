package src.oop.权限修饰Demo01;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal(); //在这里创建Animal的对象
        //System.out.println(a.name); //打印的时候会报错，就是因为name private 私有了  在同一个包的其他类用不了

        //结论1：私有只能在本类里面使用
        //结论2：在默认的情况下同一个类的其他包情况下也能用，但是在不同包下的子类是不能用的
        //结论3：protected(受保护的)在本类里面可以用，在本类里的其他类也可以用，在不同包下的子类也可以用
        //结论4：public 都可以用
    }
}
