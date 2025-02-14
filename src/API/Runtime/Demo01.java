package src.API.Runtime;

import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        /*
        1、public static Runtime getRuntime    当前系统的运行环境对象
        2、public void exit(int status)        停止虚拟机
        3、public int availableProcessors()    获得CPU的线程数
        4、public long maxMemory()             JVM能从系统中获取总内存大小(单位byte)
        5、public long totalMemory()           JVM已经从系统中获取的总内存大小(单位byte)
        6、public long freeMemory()            JVM剩余内存大小(单位byte)
        7、public Process exec(String command) 运行cmd命令
         */


        //1、获取Runtime对象
        //Runtime r1 = Runtime.getRuntime();
        //Runtime r2 = Runtime.getRuntime();
        //System.out.println(r1 == r2);

        //2、 exit  停止虚拟机
        //Runtime r1 = Runtime.getRuntime();
        //r1.exit(0);  //0是正常停止 非0是异常停止
        //System.out.println("看看我执行了吗");  //表示虚拟机停止了

        //3、availableProcessors  获得CPU的线程数
        //System.out.println(Runtime.getRuntime().availableProcessors());

        //4、maxMemory  JVM能从系统中获取总内存大小(单位byte)
        //System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);//第一次除1024是KB第二次是mb

        //5、totalMemory JVM已经从系统中获取的总内存大小(单位byte)
        //System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);//第一次除1024是KB第二次是mb

        //6、freeMemory  JVM剩余内存大小(单位byte)
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);//第一次除1024是KB第二次是mb

        //7、exec  运行cmd命令
        //shutdown:关机
        //加上参数才能执行
        //-s :默认在1分钟之后关机
        //-s -t 指定时间 :指定关机时间
        //-a :取消关机操作
        //-r:关机并重启
        Runtime.getRuntime().exec("notepad");
    }
}
