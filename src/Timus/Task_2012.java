package Timus;

import java.util.Scanner;

public class Task_2012 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tasks_for_first_hour = in.nextInt();
        int tasks_left = 12 - tasks_for_first_hour;
        int tasks_time_left_min = tasks_left * 45;
        if (tasks_time_left_min <= 4 * 60){
            System.out.print("YES");
        }else {
            System.out.print("NO");
        }
    }
}
