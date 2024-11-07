package Codeforces;
import java.util.Scanner;
public class Next_Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int y [] = new int[n];
        for(int i = 0 ;i < n ;i++){
            y[i] =sc.nextInt();
        }
        int u = y[k-1];
        int c = 0;
        for(int i = 0 ;i < y.length ;i++){
            if(y[i] >= u && y[i] > 0){
                c++;
            }
        }
        System.out.println(c);
        sc.close();
    }
}
