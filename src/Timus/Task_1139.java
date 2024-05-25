package Timus;

import java.util.Scanner;

public class Task_1139 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if ( b == 1){
            System.out.println("1");
        }
        if (a == 1) {
            System.out.print("0");
        }
        if (b >= a){
            System.out.print(a * 2 - 1);
        }
        else {
            System.out.print(b * 2);
        }
    }
}
