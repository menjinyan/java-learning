package src.API.Object;

public class Demo02 {
    public static void main(String[] args) {
        /*
        public boolean equals(Object obj)    比较两个对象是否相等
         */
        Student s1 = new Student();
        Student s2 = new Student();
        boolean result = s1.equals(s2);
        System.out.println(result);//false


        /*
        为什么是false?
        equals是由s1调用的，而s1又是student类型的，所以肯定会去找student里面的方法
        但是在Student里面没有写equals,所以他会调用父类Object中的父类方法
         */

        /*
        结论:
        1、如果没重写equals方法，那么默认使用Object中的方法进比较，比较的是地址值的是否相等
        2、一般来说，地址值对于我们的意义不大，所以我们会重写，重写之后比较的就是对象内部的属性值了
         */
    }
}
