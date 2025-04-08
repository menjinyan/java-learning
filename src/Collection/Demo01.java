package src.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01 {
    public static void main(String[] args) {
        /*

        1、public boolean add(E e)              添加

        2、public void clear()                  清空

        3、public boolean remove(Ee)            删除

        4、public boolean contains(object obj)  判断是否包含

        5、public boolean isEmpty()             判断是否为空

        6、public int size()                    集合长度


        注意点:
            Collection是一个接口，我们不能直接创建他的对象
            所以，现在我们学习爱他的方法时候，只能创建实现类的对象
            实现类:ArrayList
         */

        //目的:为了学习Collection里面的接口方法
        //当你自在做一些练习的时候，还是按照致之前的方式去创建对象

        Collection<String> coll = new ArrayList<>();

        //1、public boolean add(E e)              添加
        //细节1:如果我们要在list系列集合中添加数据，那么方法永远返回true，因为list系列是允许元素重复的
        //细节2:如果我们要在set系列集合中添加数据,如果当钱要添加元素不存在方法返回true，表示添加成功
        //但是，如果当前要添加的元素已经存在，方法返回true,表示添加失败，因为set系列的集合不允许重复
        coll.add("A");
        coll.add("B");
        coll.add("C");
        System.out.println(coll);

        //2、public void clear()                  清空
        //coll.clear();
        //System.out.println(coll);

        //3、public boolean remove(Ee)            删除
        //细节1:因为Collection里面定义的是共性的方法，所以此时不能通过索引进行删除，只能通过元素的对象进行删除
        //细节2:方法会返回一个布尔类型的返回值，删除成功返回true，删除失败返回false
        //什么时候会删除失败:要删除的元素不存在的时候就会删除失败

        //coll.remove("B");
        //System.out.println(coll);

        //4、public boolean contains(object obj)  判断是否包含
        //细节:底层是依赖equals方法进行判断是否存在的
        //所以，如果在集合中存储的是定义域，也想通过contains方法来判断是否包含，那么在Javabean类中，一定要重写equals方法

        //boolean result = coll.contains("A");
        //System.out.println(result);

        //5、public boolean isEmpty()             判断是否为空
        boolean result2 = coll.isEmpty();
        System.out.println(result2);

        //6、public int size()                    集合长度
        int siza = coll.size();
        System.out.println(siza);
    }
}
