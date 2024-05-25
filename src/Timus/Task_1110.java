package Timus;

import java.util.Scanner;

public class Task_1110 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int y = in.nextInt();
        int a=1;
        boolean x = false;
        for (int i = 0; i < m; i++) {
            a=1;
            for (int j = 0; j < n; j++) {
                a = (a*(i%m))%m;
            }
            if (a == y) {
                System.out.print(i + " ");
                x = true;
            }
        }
        if (x == false)
            System.out.print("-1");
    }
}
