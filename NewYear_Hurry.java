package Codeforces;
import java.util.Scanner;
public class NewYear_Hurry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();   
        int u = 0;
        int c = 0;
        for(int i = 1 ;i <= n ;i++){
            u = u + 5*i;
            if((240 - u) >= t){
                c++;
                continue;
            }
            else{
                break;
            }
        }
        System.out.println(c);
        sc.close();
    }
}
