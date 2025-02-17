package src.API.Math;

public class MathDemo01 {
    public static void main(String[] args) {
        /*
    public static int abs(int a) 获取参数绝对值
    public static double ceil(double a) 向上取整
    public static double floor(double a) 向下取整
    public static int round(float a) 四舍五入
    public static int max(int a,int b) 获取两个int值中的较大值
    public static double pow(double a,double b) 返回a的b次幂的值
    public static double sqrt(double a)   返回a的平方根
    public static double cbrt(double a)    返回a的立方根
    public static double random() 返回值为double的随机值，范围[0.0,1.0)
     */


        /*
         abs 获取参数绝对值
        bug:
        以Int类型为例，取值范围:-2147483648 ~ 2147483647
        如果没有正数与负数相对应，那么传递负数结果有误
        -2147483648没有正数与之相对应，所以abs结果产生bug
         */
        //System.out.println(Math.abs(88));
        //System.out.println(Math.abs(-88));
        //System.out.println(Math.abs(-2147483648));

        //如果传的数据太大了，获取不到对应的相反数就会报错
        //System.out.println(Math.absExact(-2147483648));//2147483647

        //ceil  向上取整
        //理解为进一法，往数轴的正方向进一
        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(12.54));
        System.out.println(Math.ceil(-1.34));
        System.out.println(Math.ceil(-1.54));
        System.out.println("------------");


        //floor 向下取整
        System.out.println(Math.floor(12.34));
        System.out.println(Math.floor(12.54));
        System.out.println(Math.floor(-1.34));
        System.out.println(Math.floor(-1.54));
        System.out.println("------------");

        //round  四舍五入
        System.out.println(Math.round(12.34));
        System.out.println(Math.round(12.54));
        System.out.println(Math.round(-1.34));
        System.out.println(Math.round(-1.54));
        System.out.println("------------");

        //max 获取两个整数的最大值
        System.out.println(Math.max(20, 40));
        System.out.println("------------");

        //min  获取两个整数的最小值
        System.out.println(Math.min(20, 40));
        System.out.println("------------");


        //pow 返回a的b次幂的值
        System.out.println(Math.pow(2, 3));
        //如果写的是0~1之间的小数，就会开根号
        System.out.println(Math.pow(4, 0.5));
        //如果第二个数是负数类型
        System.out.println(Math.pow(2, -2));
        //建议:一般在传递第二个参数的时候要传递大于1的正整数
        System.out.println("---------------");

        //sqrt  开根号
        System.out.println("开根号");
        System.out.println(Math.sqrt(4));
        System.out.println("---------------");

        //cbrt 开立方
        System.out.println("开立方");
        System.out.println(Math.cbrt(8));
        System.out.println("---------------");

        //random()  返回值为double的随机值，范围[0.0,1.0)
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());//在Java当中是不怎么常用的
        }
        System.out.println("---------------");

        
        //获取1~100之间的随机数
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.floor(Math.random() * 100) + 1);
        }
    }
}


//你是


