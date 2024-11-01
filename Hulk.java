package Codeforces;
import java.util.Scanner;
public class Hulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        String v = "";
        while(i <= n){
            if(i % 2 != 0 && i == n){
                v = v + "I hate it";
            }
            else if(i % 2 == 0 && i == n ){
                v = v + "I love it";
            }
            else if(i % 2 != 0 ){
                v = v + "I hate that ";
            }
            else{
                v = v + "I love that ";
            }
            i++;
        }
        System.out.println(v);
        sc.close();
    }
}
