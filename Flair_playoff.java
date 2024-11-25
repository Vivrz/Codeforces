package Codeforces;
import java.util.Arrays;
import java.util.Scanner;
public class Flair_playoff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ;i < n ;i++){
            int a [] = new int[4];
            for(int j = 0 ;j < a.length ;j++){
                a[j] = sc.nextInt();
            }
            int w = Math.max(a[0] , a[1]);
            int w1 = Math.max(a[2], a[3]);
            Arrays.sort(a);
            int l = a[2];
            int r = a[3];
            if((w == l || w == r) && (w1 == l || w1 == r)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
