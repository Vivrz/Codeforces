package Codeforces;
import java.util.Scanner;
public class Lowest_common_multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();
        for(int i = 1 ;i <= f*s*t;i++){
            if(i % f == 0 && i % s == 0 && i % t == 0 ){
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }   
}
