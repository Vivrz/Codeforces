package Codeforces;
import java.util.Scanner;
public class T_Primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        for(int  i = 0 ;i < n ;i++){
            int u = sc.nextInt();
            int c = 0;
            for(int j = 2; j <= u/2 ;j++){
                if(u % j == 0){
                    c++;
                }
            }
            if(c == 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
