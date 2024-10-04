package src.menjinyan.test;

public class Test18方法的值传递02 {
    public static void main(String[] args) {
        int[]arr={10,20,30};
        System.out.println("调用change方法前:" +arr[1]);//20
        change(arr);
        System.out.println("调用change方法后:" +arr[1]);//
    }
    public static void change(int[] arr){
        arr[1]=200;
    }
}


/*public  class ArdsDemo02{
    public static void main(String[] args) {
        int[] arr={10,20,30};
        sout("调用change方法前:"+arr[1]);
        change(arr);
        sout("调用cheng方法后:"+arr[1]);
    }
    public static void change(int[] arr){
        arr[1]=200;
    }

    看不懂请看视频的73集后半段
}*/