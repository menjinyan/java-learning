package src.Generics;

import java.util.Arrays;

/**
 * 当我在编写一个类的时候，如果不确定类型，那么这个类就要可以定义为泛类型
 */
public class MyArrayList<E> {
    Object[] obj = new Object[10];
    int size = 0;

    /*
    E:表示不确定的类型，该类型在类的后面以已经定义过了
    e:表示形参的名字也就是变量名
     */
    public boolean add(E e) {
        obj[size] = e;
        size++;
        return true;
    }

    public E get(int index) {
        return (E) obj[index];
    }


    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
