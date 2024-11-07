package Codeforces;
import java.util.Scanner;
public class Wrong_Subraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int i = 0;
        while(i < k){
            if(n%10 != 0){
                n -= 1;
            }
            else if(n%10 == 0){
                n/=10;
            }
            i++;
        }
        System.out.println(n);
        sc.close();
    }
}
