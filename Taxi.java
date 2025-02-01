package Codeforces;
import java.util.Arrays;
import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a [] = new int[n];
        for(int i = 0 ;i < n ;i++){
            a[i] = sc.nextInt();
        }
        int rem= 0;
        int c = 0;
        Arrays.sort(a);//1 1 2 2 3 3 4 0
        for(int i = a.length-1;i >= 0 ;i--){
            rem = 4 - a[i];//0
            if(rem == 0 ){
                a[i] = 0;
                c++;//1
                rem = 0;
            }
            else if(rem < a[i]){
                for(int j = i-1 ; j >=0 ;j--){
                    if(a[j] == rem){
                        rem = rem - a[j];//0
                        a[j] = 0;
                        if(rem == 0 ){
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(c);
        sc.close();
    }
}
