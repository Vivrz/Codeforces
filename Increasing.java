package Codeforces;
import java.util.Arrays;
import java.util.Scanner;
public class Increasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ;i < n ;i++){
            int m = sc.nextInt();
            int  a [] = new int[m];
            for(int j = 0 ;j < a.length ; j++){
                a[j] = sc.nextInt();
            }
            if(a.length == 1){
                System.out.println("YES");
                continue;
            }
            Arrays.sort(a);
            boolean b = true;
            for(int k = 0 ; k < a.length-1 ; k++){
                if(a[k] >= a[k+1]){
                    b = false;
                    break;
                }
            }
            if(b == false){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
