package Codeforces;
import java.util.Scanner;
public class Raising_bacteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println(1);
        }
        else{
            System.out.println(2);
        }
        sc.close();
    }
}
