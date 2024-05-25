package Timus;

import java.util.Scanner;

public class Task_2001 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        int a3 = in.nextInt();
        int b3 = in.nextInt();
        int basket1berry1 = a1;
        int basket2berry2 = b1;
        int basket1berry1berry2 = a2;
        int basket2 = b2;
        int berry2 = basket2berry2 - basket2;
        int basket1 = a3;
        int berry1 = basket1berry1 - basket1;
        System.out.print(berry1 + " ");
        System.out.print(berry2);
    }
}
