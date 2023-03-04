package com.tge.test6;

public class GirlFriendTest {
    public static void main(String[] args) {

        GirlFriend[] arr = new GirlFriend[4];

        GirlFriend gf1 = new GirlFriend("xiaohong", 25, "girl", "dance");
        GirlFriend gf2 = new GirlFriend("xiaohuang", 22, "girl", "sing");
        GirlFriend gf3 = new GirlFriend("xiaobai", 24, "girl", "study");
        GirlFriend gf4 = new GirlFriend("xiaolan", 38, "girl", "tenis");


        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].getAge();

        }

        int Avg = sum / arr.length;
        System.out.println(Avg);
        GirlFriend[] newArr = new GirlFriend[4];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge()<Avg){

                System.out.println(arr[i].getName()+","+arr[i].getAge()+","+arr[i].getGender()+","+arr[i].getHobby());
                count++;
            }
        }
        System.out.println(count);



    }
}
