package Timus;

import java.util.Scanner;

public class Task_2100 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] friends = new String[n];
        in.nextLine();
        for(int i = 0;i < n;i++){
            friends[i] = in.nextLine();
        }
        int price = 2;
        for(int i = 0; i < n; i++){
            if(friends[i].contains("+one")) {
                price += 2;
            }
            else price += 1;
        }
        if(price == 13) price++;
        System.out.print(price*100);
    }
}
