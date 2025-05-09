package src.Block.Search;

public class Demo01 {
    public static void main(String[] args) {
        /*
        分块查找
        核心思路:
        块内无序，块间有序
        实现步骤:
        1、创建数组blckArr存放每一个块对象的信息
        2、先查找bloakArr确定要查找的数据属于哪一块
        3、再单独遍历这一块数据即可
         */
        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};

        //创建三个块的对象
        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);

        //定义数组用来管理三个块的对象(索引表)
        Block[] blocker = {b1, b2, b3};
        //定义一个变量用来记录要查找的元素
        int number = 37;

        //调用一个方法传递索引表，数组，要查找的元素
        int index = getIndex(blocker, arr, number);

        System.out.println(index);
    }

    //利用分块查找的原理，查询number的索引
    //1、先确定number在索引表的位置
    private static int getIndex(Block[] blocker, int[] arr, int number) {
        //确定number是在哪一块当中的
        int indexBlock = findIndexBlock(blocker, number);
        if (indexBlock == -1) {
            //表示不在数组当中
            return -1;
        }
        //获取这一块的起始索引和结束索引
        int start = blocker[indexBlock].getStartIndex();
        int end = blocker[indexBlock].getEndIndex();

        //遍历
        for (int i = start; i <= end; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    //定义一个方法用来确定number是在哪一块当中
    public static int findIndexBlock(Block[] blocker, int number) {

        //Block b1 = new Block(21, 0, 5);   0
        //Block b2 = new Block(45, 6, 11);  1
        //Block b3 = new Block(73, 12, 17); 2

        //从0索引开始遍历blocker 如果number是小于max，那么就表示number是在这一块中的
        for (int i = 0; i < blocker.length; i++) {
            if (number <= blocker[i].getMax()) {
                return i;
            }
        }
        return -1;
    }
}


class Block {
    private int max;//最大值
    private int startIndex;//起始索引
    private int endIndex;//结束索引

    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
}