package src.oop.InnerClassDemo02;

public class Outer {

    String name;
   private class Inner {

    }

    public Inner getInner() {
       return new Inner();
    }
}
