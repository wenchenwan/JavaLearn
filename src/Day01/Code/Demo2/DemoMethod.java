package Day01.Code.Demo2;
import jdk.dynalink.support.SimpleRelinkableCallSite;

import java.util.Scanner;
import java.util.Random;
import java.security.PublicKey;

public class DemoMethod {
    public static void main(String [] args){
        System.out.println(sum(3,2));
        System.out.println(sum(1,2,3));
        String[] array = {};
        String[] Temp = new String[10];
        Phone Huawei = new Phone();
        Scanner my = new Scanner(System.in);
//        int src = my.nextInt();
//        int srv = my.nextInt();
//        System.out.println(src+srv);

        Random ra = new Random();
        System.out.println(ra.nextInt(100));

        String str = new String("Hello World!!!!");
        System.out.println(str.charAt(1));
        byte[] bit = str.getBytes();
        for(int i = 0;i < str.length();i++){
            System.out.println(bit[i]);
        }
        String[] str1 = str.split(" ");
        for (int i = 0; i < str1.length; i++) {
            System.out.println(str1[i]);
        }

    }

    public static void MyMethod(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static int sum(int a,int b){
        return a + b;
    }

    public static int sum(int a,int b,int c){
        return a + b + c;
    }
}
