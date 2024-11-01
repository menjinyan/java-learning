package src.字符串;

public class StringDemo12敏感词替换 {
    public static void main(String[] args) {
        //String replace(旧值，新值)替换
        //注意点:只有返回值才是替换之后的结果

        //1、获取到说的话
        String talk = "你玩的真好，以后不要在玩了，TMD";

        //2、定义一个敏感词库
        String[]arr={"TMD","MLGB","CNM","SB"};

        //3、循环得到数组中的每一个敏感词，依次进行替换
        for (int i = 0; i < arr.length; i++) {
            talk=talk.replace(arr[i], "***");
        }
        //4、打印结果
        System.out.println(talk);
    }
}
