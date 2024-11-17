package Codeforces;
import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i < n ;i++){
            int m = sc.nextInt();
            if(m <= 1399){
                System.out.println("Division 4");
                continue;
            }
            else if(m <= 1599 && m >= 1400){
                System.out.println("Division 3");
                continue;
            }
            else if(m <= 1899 && m >= 1600){
                System.out.println("Division 2");
                continue;
            }
            else{
                System.out.println("Division 1");
            }
        }
        sc.close();
    }
}
