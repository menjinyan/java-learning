package src.对象数组练习03;

public class PhoneTest {
    public static void main(String[] args) {
        //1、创建一个数组
        Phone[] arr = new Phone[4];
        //2、创建手机对象
        Phone P1 = new Phone("小米", 3999, "白色");
        Phone p2 = new Phone("红米", 2999, "黑色");
        Phone p3 = new Phone("oppo", 3999, "蓝色");
        Phone p4 = new Phone("魅族", 1999, "蓝色");
        //3、把手机添加到数组当中
        arr[0] = P1;
        arr[1] = p2;
        arr[2] = p3;
        arr[3] = p4;
        //4、获取三部手机的平均价格
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //i表示索引 arr[i]表示元素也就是这里的手机
            Phone phone = arr[i];
            sum = sum + phone.getPrice();

            //5、求平均值
            int avg = sum / arr.length;//这里为什么不写3，是因为数据能不写死就不写死，可以随之改变
            System.out.println(avg);
        }
    }
}
