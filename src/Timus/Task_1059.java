package Timus;

import java.util.Scanner;

public class Task_1059 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("0");
        if (n != 0) {
            System.out.println("X");
            System.out.println("*");
        }
        for (int i = 0; i < n-1; i++){
            System.out.println(i);
            System.out.println("+");
            System.out.println("X");
            System.out.println("*");
        }
        System.out.println(n);
        System.out.println("+");
    }
}
