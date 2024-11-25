package Codeforces;
import java.util.Scanner;
public class Array_odd_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ;i < n ;i++){
            int m = sc.nextInt();
            sc.nextLine();
            int a [] = new int[m];
            for(int j = 0; j < m ; j++){
                a[j] = sc.nextInt();
            }   
            boolean v = false;
             for(int k = 0 ;k < a.length ;k++){
                for(int h = k+1 ; h < a.length ; h++){
                    if((a[k] + a[h] ) % 2 != 0){
                        v = true;
                        break;
                    }
                }
             }
             int sum = 0;
             for(int k = 0 ; k < a.length ;k++){
                sum = sum + a[k];
             }
             if(v == true || sum % 2 != 0){
                System.out.println("YES");
             }
             else{
                System.out.println("NO");
             }
        }
        sc.close();
    }   
}
