package com.tge.test7;

public class StudenTest {
    public static void main(String[] args) {

        //1.创建一个数组，存储学生对象
        Student[] arr = new Student[3];

        //2.创建学生对象并添加到数组当中
        Student stu1 = new Student(1, "zhangsan", 18);
        Student stu2 = new Student(2, "lisi", 19);


        //3.把学生对象放到数组中
        arr[0] = stu1;
        arr[1] = stu2;


        //要求1：再次添加一个学生对象，并在添加的时候进行学号唯一性判断
        Student stu4 = new Student(2, "zhaoliu", 20);


        //唯一性判断
        //已存在 ----- 不用添加
        //不存在 ----- 就可以把学生对象添加进数组
        boolean flag = contains(arr, stu4.getId());
        if (flag) {
            System.out.println("当前id存在，请修改id后再进行添加");
        } else {
            //把stu4添加到数组中
            //1.数组已经存满 ----- 只能创建一个新的数组，新数组的长度 = 老数组 +1
            //2.数组没有存满 ----- 直接添加
            int count = getCount(arr);
            if (count == arr.length) {
                //已经存满
                //创建一个新的数组，长度=老数组长度 + 1
                //然后把老数组的元素，拷贝到新数组中
                Student[] newArr = createNewArr(arr);
                newArr[count] = stu4;
                printArr(newArr);
            } else {
                //没有存满
                //getcount获取的是2，表示数组中已有2个元素
                //还有一层意思，如果下一次药添加数据，就添加到2索引的位置
                arr[count] = stu4;
                printArr(arr);
            }
        }



        }




    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].getId() + "," + arr[i].getName() + "," + arr[i].getAge());
            }
        }
    }


    //创建一个新的数组，长度=老数组长度 + 1
    //然后把老数组的元素，拷贝到新数组中
    public static Student[] createNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        //循环遍历得到老数组中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }


    //定义一个方法判断数组中已经存了几个元素
    public static int getCount(Student[] arr) {
        //定义一个计数器来统计
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    //1.我要干嘛？  唯一性判断
    //2.我干这件事情，需要什么才能完成？ 数组 id
    //3。调用处是否需要继续使用方法的结果

    public static boolean contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            //null不能调用，因此先要对arr判断非null才继续判断
            if (arr[i]!=null){
                if (arr[i].getId() == id) {
                    return true;
                }
            }
        }
        return false;
    }
}

