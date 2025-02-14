package src.API.Object;

public class Demo01 {
    public static void main(String[] args) {
        /*
        1、public String toString()            返回对象的字符串表示形式
        2、public boolean equals(Object obj)    比较两个对象是否相等
        3、protected Object clone(int a)        对象克隆
         */

        //1、toString  返回对象的字符串表示形式
        Object obj = new Object();
        String str1 = obj.toString();
        System.out.println(str1);//java.lang.Object@10f87f48
        /*
        java.lang.Object@10f87f48解释:
        以中间的@为中心，前面是包名加类名，后面是对象的地址值
         */
        Student stu = new Student("zhangsan",23);
        String str2 = stu.toString();
        System.out.println(str2);//src.API.Object.Student@2f4d3709
        /*
        src.API.Object.Student@2f4d3709
        以中间的@为中心，前面是包名加类名，后面是对象的地址值
         */

        //细节:
        //如果没有调用toString方法而是打印对象，其实效果是一样的
        System.out.println(stu);
        /*
        认识System.out.println()
        System:类名
        out:静态变量
        System.out:获取打印对象
        println():方法
        参数:表示打印的内容
        核心逻辑:
        当我们打印一个对象的时候，底层会调用toSrting方法，把对象变成字符串
        然后再打印在控制台上，打印完毕进行处理
         */

        /*
       思考:
       默认情况下，因为3Object类2中的toString方法返回的是地址值
       所以，默认情况下打印一个对象的就是地址值
       但是地址值对我们是没有什么意义的
       我想看对象内部的属性值，应该怎么办？
       处理方案:重写Object中的toString方法0
         */

        /*
        toString方法的结论:
        如果我们打印一个对象，想要看到属性值的话，那么就重写toString方法就可以了
        在重写的方法中，把对象的属性值进行拼接
         */
    }
}
