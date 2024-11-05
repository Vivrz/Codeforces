package Codeforces;
import java.util.Scanner;
public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        int d = 0;
        for(int i = 0 ;i < n ;i++){
            c = 0;
            for(int j = 0 ;j < 3 ;j++){
                int y = sc.nextInt();
                if(y == 1){
                    c++;
                }
            }
            if(c >= 2){
                d++;
            }
        }
        System.out.println(d);
        sc.close();
    }
}
