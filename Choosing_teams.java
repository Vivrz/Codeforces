package Codeforces;
import java.util.Scanner;
public class Choosing_teams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int k = sc.nextInt();
        int h [] = new int[n];
        for(int i = 0 ; i < n ;i++){
            int e = sc.nextInt();
            h[i] = e;
        }
        int count = 0;
        for(int g : h){
            if((5-g) >= k){
                count++;
            }
            else{
                continue;
            }
        }
        System.out.println(count/3);
        sc.close();
    }
}
