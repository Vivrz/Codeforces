package Codeforces;
import java.util.Scanner;
public class Reconnaissance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        sc.nextLine();
        int a [] = new int[n];
        for(int i = 0 ;i < n ;i++){
            a[i] = sc.nextInt();
        }
        int c = 0;
        for(int i = 0 ;i < a.length ;i++){
            for(int j = i+1 ; j < a.length ;j++){
                if(Math.abs(a[i]-a[j]) <= d){
                    c+=2;
                }
            }
        }
        System.out.println(c);
        sc.close();
    }
}
