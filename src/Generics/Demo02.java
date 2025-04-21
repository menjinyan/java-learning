package src.Generics;

public class Demo02 {
    public static void main(String[] args) {
        /*
        MyArrayList<String> list = new MyArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);
        */
        MyArrayList<Integer> list2 = new MyArrayList<>();
        list2.add(123);
        list2.add(456);
        list2.add(789);
        Integer i = list2.get(0);
        System.out.println(i);
        System.out.println(list2);
    }
}
