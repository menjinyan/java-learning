package src.Recursion;

public class Demo02 {
    public static void main(String[] args) {

        //需求：用递归求5的阶乘，并把结果在控制台输出
        //5!=5*4!
        //4!=4*3!
        //3!=3*2!
        //2!=2*1!
        //1!=1

        System.out.println(Factorial(5));
    }
    public static int Factorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * Factorial(number - 1);
    }

}
