package Timus;

import java.util.Scanner;

public class Task_1319 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] hotel = new int[n][n];
        int a = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                hotel[i - j][j] = a;
                a++;
            }
        }
        for (int j = 1; j < n; j++) {
            for (int i = 0; i <= n - 1 - j; i++) {
                hotel[n-1-i][j+i] = a;
                a++;
            }
        }
        for (int i=0; i<n; i++) {
            for(int j=n-1; j>=0; j--) {
                System.out.print(hotel[j][i] + " ");
            }
            System.out.println();
        }
    }
}
