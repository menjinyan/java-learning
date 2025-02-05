package src.oop.局部代码块;

public class Demo01 {
    public static void main(String[] args) {
        {
            int a =10;
        }
        //当代码执行到这里时变量a就从内存中消失了
        //System.out.println(a);
    }
}
