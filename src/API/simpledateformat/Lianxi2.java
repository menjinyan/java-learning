package src.API.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Lianxi2 {
    public static void main(String[] args) throws ParseException {
        /*
        需求
小贾下单并付款的时间为：2023年11月11日0:01:00  (转换为毫秒值才可以比较)
小皮下单并付款的时间为：2023年11月11日0:10:0   (转换为毫秒值才可以比较)
用代码说明这两位同学有没有参加上秒杀活动？
         */

        //1、定义字符串表示三个时间
        String startStr = "2023年11月11日00:00:00";
        String endStr = "2023年11月11日00:10:00";
        String orderStr = "2023年11月11日00:01:00";

        //2、解析上面的三个时间，再得到Date对象
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        Date startDate = sdf1.parse(startStr);
        Date endDate = sdf1.parse(endStr);
        Date orderDate = sdf1.parse(orderStr);


        //3、得到三个时间的毫秒值
        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long orderTime = orderDate.getTime();

        //4、判断
        if (orderTime >= startTime && orderTime <= endTime) {
            System.out.println("参加秒杀活动成功");
        } else {
            System.out.println("参加秒杀活动失败");
        }
    }
}
