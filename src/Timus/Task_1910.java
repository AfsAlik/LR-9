package Timus;

import java.util.Scanner;

public class Task_1910 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Size;
        int result2 = 2;
        Size = in.nextInt();
        int[] second  = new int[Size];
        for (int i = 0; i < Size; i++) {
            second [i] = in.nextInt();
        }
        int result1  = second [0]+second [1]+second [2];
        for (int i = 2; i < (Size-1); i++) {
            int sumTemp = second [(i-1)]+second [i] + second [(i+1)];
            if (sumTemp>result1 ){
                result1  = sumTemp;
                result2 = i+1;
            }
        }
        in.close();
        System.out.println(result1 +" " + result2);
    }
}
