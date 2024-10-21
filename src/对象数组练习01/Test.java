package src.对象数组练习01;

public class Test {
    public static void main(String[] args) {
        //1、创建一个数组
        Shopping[] arr = new Shopping[3];
        //2、创建三个参数对象
        Shopping t1 = new Shopping("001", "华为 p", 5999.0, 100);
        Shopping t2 = new Shopping("002", "小米", 3999.0, 199);
        Shopping t3 = new Shopping("003", "oppo", 4999.0, 200);
        //3、把商品添加到数组当中
        arr[0] = t1;
        arr[1] = t2;
        arr[2] = t3;

        //4、遍历数组
        for (int i = 0; i < arr.length; i++) {
            //i索引 arr[i]元素
            Shopping shopping = arr[i];
            System.out.println(shopping.getId() + "," + shopping.getName() + "," + shopping.getPrice() + "," + shopping.getCount());

        }
    }
}
