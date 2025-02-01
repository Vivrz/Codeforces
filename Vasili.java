package Codeforces;
import java.util.Arrays;
import java.util.Scanner;
public class Vasili {
    public static int Count(int a [] , int u){
        int low = 0;
        int high = a.length;
        while(low < high){
            int mid = low + (high - low)/2;
            if(a[mid] <= u){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int a [] = new int[n];
        for(int i = 0 ;i < n ;i++){
            a[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        Arrays.sort(a);
        for(int i = 0 ;i < q ;i++){
            int u = sc.nextInt();
            int c =Count(a , u);
            System.out.println(c);
        }
        sc.close();
    }
}
