package Timus;

import java.util.Scanner;

public class Task_1225 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        long flag[] = new long[46];

        flag[1] = 2;
        flag[2] = 2;
        for (int i = 3; i <= N; i++) {
            flag[i] = flag[i - 1] + flag[i - 2];
        }
        System.out.println(flag[N]);
        in.close();
    }
}
