package src.对象数组练习05;

public class StudentTest {
    public static void main(String[] args) {
        /* 定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
    学生的属性:学号，姓名，年龄。
    要求1:再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
    要求2:添加完毕之后，遍历所有学生信息。
    要求3:通过id删除学生信息
    如果存在，则删除，如果不存在，则提示删除失败。
    要求4:删除完毕之后，遍历所有学生信息。
    要求5:查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁*/

        //创建一个数组用来存储学生对象
        Student[] arr = new Student[3];

        //2、创建学生对象并添加到数组当中
        Student stu1 = new Student(1, "zhangshan", 22);
        Student stu2 = new Student(2, "wangwu", 23);
        Student stu3 = new Student(3, "lisi", 24);
        //把学生对象添加到数组当中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //要求1、再次添加一个学生对象，并在添加的时候进行学号的唯一判断性
        //读题拆解法
        Student stu4 = new Student(3, "wangwu", 25);

        //唯一性判断
        //已经存在....不用添加
        //不存在....就可以把学生对象添加到数组当中
        boolean flage = contains(arr, stu4.getId());
        if (flage) {
            //已存在....不用添加
            System.out.println("当前id重复，请修改id之后在进行添加");
        } else {
            //不存在... 就可以把学生对象添加进数组
            //把stu4添加到数组当中
            //1、数组已经存满...只能创建一个新的数组，新数组的长度=老数组的长度+1
            //2、数组没有存满...直接添加
            int count = getCound(arr);
            if (count == arr.length) {
                //已经存满
                //创建一个新的数组，新数组的长度=老数长度+1
                //然后把老数组的长度添加到新的数组当中
                Student[] newArr = CreatNewArr(arr);
                //把stu4添加进去
                newArr[count] = stu4;


            } else {
                //没有存满
                //getCound获取到的是2，表示添加数组当中已经有了2个元素
                //还有一层意思，如果下一次要添加数据，就是添加到2个索引的位置
                arr[count] = stu4;
            }
        }
    }

    //创建一个新的数组，新数组的长度=老数长度+1
    //然后把老数组的长度添加到新的数组当中
    public static Student[] CreatNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        //循环遍历得到老数组中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            //把老数组中的元素添加到新的数组当中
            newArr[i] = arr[i];
        }
        //把新的数组返回
        return newArr;
    }


    //定义一个方法判断数组中已经存在了几个元素
    public static int getCound(Student[] arr) {
        //定义一个计数器用来统计
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        //当循环结束之后，我就知道了数组中一共有几个元素
        return count;
    }

    public static boolean contains(Student[] arr, int id) {
        //以此获取到循环数组里面的每一个对象
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            //获取数组中学生对象的id
            int sid = stu.getId();
            //比较
            if (sid == id) {
                return true;
            }
        }
        //当循环结束之后，还没有找到一样的，那么就表述数组中要查找的id是不存在的
        return false;
    }
}
