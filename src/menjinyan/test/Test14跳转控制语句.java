package src.menjinyan.test;

public class Test14跳转控制语句 {
    public static void main(String[] args) {
        //小老虎吃包子，有五个包子，第三个有虫子需要跳过。
        //1、跳过某一次循环
        /*for (int i=1;i<=5;i++){
            if(i==3){
                //2、结束本次循环进入下次循环
                continue;
            }
            System.out.println("小老虎在吃第"+i+"个包子");
        }*/

        //改写：
        for (int i=1;i<=5;i++){
            System.out.println("小老虎在吃第"+i+"个包子");
            if(i==3){

                //2、结束整个循环
                break;
            }

        }
    }
}
