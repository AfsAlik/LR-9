package Timus;

import java.util.Scanner;

public class Task_1010 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = 0;
        int b = 0;
        int c = 0;
        int N = scanner.nextInt();
        long a1 = scanner.nextLong();
        for (int i = 2; i <= N; i++) {
            long b1 = scanner.nextLong();
            if (Math.abs(b1 - a1) > a) {
                a = Math.abs(b1 - a1);
                b = i - 1;
                c = i;
            }
            a1 = b1;
        }
        System.out.println(b + " " + c);
    }
}
