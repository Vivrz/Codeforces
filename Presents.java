package Codeforces;
import java.util.Scanner;
public class Presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int u [] = new int[n];
        for(int i = 0 ;i < n ;i++){
            u[i] = sc.nextInt();
        }
        int f = 1;
        int b =0;
        int j = 0;
        while(b != u.length){
            if(j >= u.length){
                j = 0;
            }
            if(f == u[j]){
                System.out.print(j+1 + " ");
                f++;
                b++;
                j = 0;
            }
            else{
                j++;
            }
        }
        sc.close();
    }
}
