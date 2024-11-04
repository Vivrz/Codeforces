package Codeforces;

import java.util.Scanner;

public class Vasya_Hipster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        if(n <= h){
            System.out.print(n);
            System.out.print(" " + (h - n)/2);
        }
        else{
            System.out.print(h);
            System.out.print(" " + (n-h)/2);
        }
        sc.close();
    }
}
