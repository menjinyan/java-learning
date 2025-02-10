package src.oop.InnerClassDemo03;

public class Outer {

    private int a = 10;

    class Inner {
        private int a = 20;

        public void show() {
            int a = 30;
            //Outer.this获取了外部对象的地址值，也表示外部类的对象
            System.out.println(Outer.this.a);//10
            System.out.println(this.a);//30
            System.out.println(a);//20
        }
    }
}
