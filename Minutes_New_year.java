package Codeforces;
import java.util.Scanner;
public class Minutes_New_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ;i < n ;i++){
            int h = sc.nextInt();
            int m = sc.nextInt();
            int left = 0;
            if(h < 23){
                left = (24 - h)*60 - m;
            }
            else{
                left = 60 - m;
            }
            System.out.println(left);
        }
        sc.close();
    }
}
