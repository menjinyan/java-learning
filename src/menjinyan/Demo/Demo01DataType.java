package src.menjinyan.Demo;

public class Demo01DataType {

    public static void main(String[] args) {

//     1、公交车乘客问题：
      //一开始没有乘客
        int count =0;
        //第一站，上去一位乘客
        count=count+1;
        //第二站，上去两位乘客，下来一位乘客
        count=count+2-1;
        //第三站，上去两位乘客，下来一位乘客
        count=count+2-1;
        //第四战。下来一位乘客
        count=count-1;
        //第五战；上去一位乘客
        count=count+1;
        //请问,到了终点站，车上一共几位乘客。
        System.out.println(count);

        //数据类型
        byte b=10;
        System.out.println(b);
        short c=20;
        System.out.println(c);
        int i=30;
        System.out.println(i);
        long l=4000000000L;
        System.out.println(l);
        float f=5.0f;
        System.out.println(f);
        double d=50.0;
        System.out.println(d);
        char a1='中';
        System.out.println(a1);
        boolean b1=true;
        System.out.println(b1);
    }

}
