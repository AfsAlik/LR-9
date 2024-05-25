package Timus;

import java.util.Scanner;

public class Task_1924 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 1;
        int i = 1;
        while (i < n){
            if (i % 2 != 0){
                result += (i + 1);
            }else {
                result -= (i + 1);
            }
            i += 1;
        }
        if (result % 2 == 0){
            System.out.print("black");
        }else {
            System.out.print("grimy");
        }
    }
}
