package Codeforces;
import java.util.Arrays;
import java.util.Scanner;

public class Kuriyama_stones {
    public static long sort(long a [] , int l , int r){
        Arrays.sort(a);
        int w = l-1;
        int u = r-1;
        long sum = 0;
        while(w <= u){
            sum = sum + a[w];
            w++;
        }
        return sum;
    }
    public static long type1(long v [] , int l , int r){
        int y = l-1;
        int e = r-1;
        long s = 0;
        while(y <= e){
            s = s + v[y];
            y++;
        }
        return s;
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    long a [] = new long[n];
    long v [] = new long[n];
    for(int i = 0 ;i < n ;i++){
        int uu = sc.nextInt();
        a[i] = uu;
        v[i] = uu;
    }
    int m = sc.nextInt();
    sc.nextLine();
    for(int j = 0;j < m ;j++){
        int type = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        if(type == 2){
            System.out.println(sort(a , l , r));
        }
        else{
            System.out.println(type1(v, l, r));
        }
    }
    sc.close();
   }
}
