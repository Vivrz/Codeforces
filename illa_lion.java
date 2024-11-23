package Codeforces;
import java.util.Scanner;
public class illa_lion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder f = new StringBuilder(String.valueOf(n));
        if(n >= 0){
            System.out.println(n);
        }
        else{
            f.deleteCharAt(f.length()-2);
            int sec = Integer.parseInt(f.toString());
            f = new StringBuilder(String.valueOf(n));
            f.deleteCharAt(f.length()-1);
            int las = Integer.parseInt(f.toString());
            if(sec > las){
                System.out.println(sec);
            }
            else{
                System.out.println(las);
            }
        }
        sc.close();
    }
}
