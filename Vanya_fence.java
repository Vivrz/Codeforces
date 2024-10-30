package Codeforces;
import java.util.*;
public class Vanya_fence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int num [] = new int[n];
        for(int i = 0 ;i < n ;i++){
            num[i] = sc.nextInt();
        }
        int c = 0;
        for(int y : num){
            if(y > h){
                c += 2;
            }
            else{
                c += 1;
            }
        }
        System.out.println(c);
        sc.close();
    }
}
