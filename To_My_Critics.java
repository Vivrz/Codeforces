package Codeforces;
import java.util.*;
public class To_My_Critics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ;i < n ;i++){
            int a [] = new int[3];
            for(int k = 0; k < a.length ;k++){
                a[k] = sc.nextInt();
            }
            if(a[0]+a[a.length-1] >= 10){
                System.out.println("yes");
                continue;
            }
            boolean v = false;
            for(int j = 1; j < a.length ;j++){
                if(a[j]+a[j-1] >= 10){
                    v = true;
                }
            }
            if(v == true){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }    
        sc.close();
    }
}
