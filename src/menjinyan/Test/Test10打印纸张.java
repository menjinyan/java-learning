package src.menjinyan.Test;

public class Test10打印纸张 {
    public static void main(String[] args) {
        //打印折纸的次数
        //珠穆朗玛峰的高度是8844430米，一张足够大的纸需要折叠多少次才可以(纸张的厚度是0.1毫米)
        //分析，每折一次，纸张的厚度是原先的2倍
        double a=0.1;
        a=a*2;
        a *=2;
        //定义一个变量用来记录山峰的高度
        double height=884430;
        //定义一个变量来记录纸张的初始厚度
        double paper=0.1;
        //定义一个变量用来统计次数
        int count=0;
        //循环折叠纸张。只要纸张的厚度小于山峰的高度，那么循环继续
        //每折叠一次。统计次数就要++
        //选择while理由：此时我们不知道循环的次数和循环的范围。只知道循环的条件，所以用while
        while(paper<height){
            paper=paper*2;
            count++;
        }
        System.out.println(count);
    }
}
