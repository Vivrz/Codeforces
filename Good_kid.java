package Codeforces;
import  java.util.Scanner;
public class Good_kid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i < n ;i++){
            int m = sc.nextInt();
            int a [] = new int[m];
            int min = Integer.MAX_VALUE;
            for(int j = 0;j<a.length ;j++){
                a[j] = sc.nextInt();
                min = Math.min(min , a[j]);
            }
            for(int k = 0 ;k < a.length ;k++){
                if(a[k] == min){
                    a[k] = min + 1;
                    break;
                }
            }
            int u = 1;
            for(int g = 0 ; g < a.length ;g++){
                u = u * a[g];
            }
            System.out.println(u);
        }
        sc.close();
    }
}
