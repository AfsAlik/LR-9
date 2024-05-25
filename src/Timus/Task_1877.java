package Timus;

import java.util.Scanner;

public class Task_1877 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lock1 = in.nextInt();
        int lock2 = in.nextInt();
        int thief_code = 0;
        while (thief_code <= 9999) {
            if (thief_code % 2 == 0) {
                if (thief_code == lock1) {
                    System.out.print("yes");
                    System.exit(0);
                }
            } else if (thief_code == lock2) {
                System.out.print("yes");
                System.exit(0);
            }
            thief_code += 1;
        }
        System.out.print("no");
    }
}
