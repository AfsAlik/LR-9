package Timus;

import java.util.Scanner;

public class Task_1787 {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        int left = 0;
        for (int i = 0; i < int2; i++){
            int a = scanner.nextInt();
            left = left + a - int1;
            if (left<0){
                left = 0;
            }
        }
        System.out.println(left);
    }
}
