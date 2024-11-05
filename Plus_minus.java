package Codeforces;

import java.util.Scanner;

public class Plus_minus {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ;i <  n;i++){
            int y = sc.nextInt();
            int f = sc.nextInt();
            int u = sc.nextInt();
            if((y-f) == u){
                System.out.println("-");
            }
            else if((y+f) == u){
                System.out.println("+");
            }
        }
        sc.close();
    }
}
