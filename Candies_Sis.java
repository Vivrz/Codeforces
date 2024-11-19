package Codeforces;
import java.util.Scanner;
public class Candies_Sis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ;i < n ; i++){
            int m = sc.nextInt();
            if(m <= 2){
                System.out.println(0);
                continue;
            }
            else{
                System.out.println((m-1)/2);
            }
        }
        sc.close();
    }
}
