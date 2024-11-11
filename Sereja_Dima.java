package Codeforces;
import java.util.*;
public class Sereja_Dima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y [] = new int[n];
        for(int i = 0;i < n ;i++){
            y[i] = sc.nextInt();
        }
        int l = 0;
        int r = y.length-1;
        int s =0 ;
        int d = 0;
        int c = 1;
        while(l <= r){
            if(c % 2 != 0){
                if(y[l] > y[r]){
                    s+=y[l];
                    l++;
                }
                else{
                    s+=y[r];
                    r--;
                }
            }
            else{
                if(y[l] > y[r]){
                    d+=y[l];
                    l++;
                }
                else{
                    d+=y[r];
                    r--;
                }
            }
            c++;
        }
        System.out.println(s + " " + d);
        sc.close();
    }
}
