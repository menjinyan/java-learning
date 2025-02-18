package src.API.Objects;

import java.util.Objects;

public class Demo01 {
    public static void main(String[] args) {
         /*
    一:public static boolean equals(Object a, Object b)  先做非空判断，比较两个对象
    二:public static boolean inNull(Object obj)          判断对象是否为null 为Null返回true
    三:public static boolean nonNull(Object obj)         判断对象是否为null，跟isnull的结果相反
     */

        //一:public static boolean equals(Object a, Object b)  先做非空判断，比较两个对象
        //1、创建学生类的对象
        Student s1 = null;
        Student s2 = new Student("zhangsan", 23);

        //2、比较两个对象的属性值是不是一样的
        /*
        if (s1 != null) {
            boolean result = s1.equals(s2);
            System.out.println(result);
        } else {
            System.out.println("调用者为空");
        }
         */

        boolean result = Objects.equals(s1, s2);
        System.out.println(result);

        //细节:
        //1、方法的底层会判断s1是否为Null,如果为Null，直接返回false
        //2、如果s1不为Null,那么就利用s1再次调用equals方法
        //3、此时s1是Student类型，所以最终还是会调用Student中的equals方法
        //4、如果没有重写，比较地址值，如果重写了，就比较属性值


        //二:public static boolean inNull(Object obj)          判断对象是否为null 为Null返回true
        Student s3 = new Student();
        Student s4 = new Student();
        System.out.println(Objects.isNull(s3));//false
        System.out.println(Objects.isNull(s4));//true

        System.out.println(Objects.nonNull(s3));//true
        System.out.println(Objects.nonNull(s4));//false
    }
}
