package src.menjinyan.test;

public class Test13循环高级综合练习 {
    public static void main(String[] args) {
        //for格式的无限循环
        /*for (;;){
            System.out.println("学习");
        }*/

        //while格式的无限循环
        /*while(true){
            System.out.println("学习");
        }*/

        //注意事项：
        //无限循环的下面不能再写其他代码了，因为循环永远停不下来，下面的代码永远执行不到
//       while(true){
//           System.out.println("给女神表白");
//
//        }
       // System.out.println("女神答应我了"); 这一步就是在无限循环下面写的代码，执行不到


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
