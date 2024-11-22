package Codeforces;
import java.util.Scanner;
public class UltraFast_Maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String h = sc.next();
        String k = sc.next();
        StringBuilder s= new StringBuilder();
        for(int i = 0 ;i < h.length() ; i++){
            if(h.charAt(i) != k.charAt(i)){
                s.append(1);
            }
            else{
                s.append(0);
            }
        }
        System.out.println(s);
        sc.close();
    }
}
