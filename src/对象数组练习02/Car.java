package src.对象数组练习02;

public class Car {
    //定义数组存储的3部汽车对象
    //汽车的属性:品牌，价格，颜色
    //创建三个汽车对象，数据通过键盘录，并把数据存入到数组当中

    private String brand;
    private String color;
    private int price;


    public Car() {
    }

    public Car(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}