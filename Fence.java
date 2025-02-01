package Codeforces;
import java.util.*;
public class Fence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
         for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        int res = 0;
        int sum = Integer.MAX_VALUE;
        for(int j = 0;j<a.length-m;j++){
            int sum1  = 0;
            for(int h = j;h<j+m;h++){
                sum1 +=a[h];
            }
            if(sum > sum1){
                sum = sum1;
                res = j;
            }
        }
        System.out.println(res+1);
        sc.close();
    }
}
