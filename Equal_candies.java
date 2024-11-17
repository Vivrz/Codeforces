package Codeforces;
import java.util.Scanner;
public class Equal_candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i < n ;i++){
            int m = sc.nextInt();
            sc.nextLine();
            int min = Integer.MAX_VALUE;
            int a [] = new int[m];
            for(int j = 0 ;j < m ;j++){
                int g = sc.nextInt();
                min = Math.min(min , g);
                a[j] = g;
            }
            int u = 0;
            for(int  k = 0 ; k < a.length;k++){
                if(a[k] > min){
                    u = u + a[k]-min;
                }
            }
            System.out.println(u);
        }
        sc.close();
    }
}
