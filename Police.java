package Codeforces;
import java.util.Scanner;
public class Police {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y [] = new int[n];
        for(int i = 0 ;i < n ;i++){
            y[i] = sc.nextInt();
        }
        int p = 0;
        int c = 0;
        for(int i = 0 ;i < y.length ;i++){
            if(y[i] < 0){
                if(p ==  0){
                    c++;
                }
                else{
                    p = p + y[i];
                }
            }
            else if(y[i] > 0){
                p = p + y[i];
            }
        }
        System.out.println(c);
        sc.close();
    }
}
