package src.对象数组练习04;

public class GirlTest {
    public static void main(String[] args) {
        //1、定义数组用来存入女朋友
        Girl[] arr = new Girl[4];
        //2、创建女朋友这个对象
        Girl gf1 = new Girl("小徐", 18, "萌妹子", "吃零食");
        Girl gf2 = new Girl("小陈", 19, "萝莉", "网购");
        Girl gf3 = new Girl("小张", 20, "开朗", "出去玩");
        Girl gf4 = new Girl("小孙", 21, "活泼", "玩游戏");
        //3、把对象添加到数组当中
        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;
        //4、求和
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //i表示索引 arr[i]表示元素也就是女朋友这个对象
            Girl gf = arr[i];
            sum = sum + gf.getAge();
            //5、计算平均年龄
            int avg = sum / arr.length;
            //6、统计年龄比平均值低的有几个，打印她们的信息
            for (int i1 = 0; i1 < arr.length; i1++) {
                Girl g = arr[i1];
                if (g.getAge() < avg) {
                    count++;
                    System.out.println(g.getName() + "," + g.getAge() + "," + g.getGender() + "," + g.getHobby());
                }
            }
            System.out.println(count + "个");
        }
    }
}
