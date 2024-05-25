package Timus;

import java.util.Scanner;

public class Task_1639 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        if (m * n % 2 == 0){
            System.out.print("[:=[first]");
        }else {
            System.out.print("[second]=:]");
        }
    }
}
