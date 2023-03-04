

import java.util.ArrayList;
import java.util.Random;

public class test {
    public static void main(String[] args) {
       getCode();
    }
    public static String getCode() {
        //创建一个集合添加所有的大小写字母
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }

        StringBuilder sb = new StringBuilder();
        //随机抽取4个字符
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            //获取随机索引
            int index = r.nextInt(list.size());
            char c = list.get(index);

            sb.append(c);
        }
        //随机数字添加到末尾
        int number =r.nextInt(10);
        sb.append(number);


        //字符串变成字符，以便进行换位操作
        char[] arr = sb.toString().toCharArray();

        int randomIndex = r.nextInt(arr.length);
        //把随机索引中的字符和最大索引进行交换
        char temp = arr[randomIndex];
        arr[randomIndex]=arr[arr.length-1];
        arr[arr.length-1]=temp;

        //把字符数组变成字符串
        new String(arr);
        System.out.println(arr);
        return "";
    }

}
