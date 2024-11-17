package Codeforces;
import java.util.Scanner;
public class Honest_Coach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ;i < n ;i++){
            int m = sc.nextInt();
            sc.nextLine();
            int min = Integer.MAX_VALUE;
            int a [] = new int[m];
            for(int f = 0 ; f < m ; f++){
                a[f] = sc.nextInt();
            }
            for(int j = 0 ;j < m ;j++){
                for(int k = j+1;k < m;k++){
                    min = Math.min(min , Math.abs(a[k]-a[j]));
                }
            }
            System.out.println(min);
        }
        sc.close();
    }
}
