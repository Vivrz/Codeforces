package Codeforces;
import java.util.Scanner;
public class Mishka_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int mis = 0;
        int ch = 0;
        for(int i = 0 ;i < n ; i++){
            int m = sc.nextInt();
            int c = sc.nextInt();
            if(m > c){
                mis++;
            }
            else if(m == c){
                continue;
            }
            else{
                ch++;
            }
        }
        if(mis > ch){
            System.out.println("Mishka");
        }
        else if(mis == ch){
            System.out.println("Friendship is magic!^^");
        }
        else{
            System.out.println("Chris");
        }
        sc.close();
    }
}
