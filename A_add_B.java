package Codeforces;
import java.util.Scanner;
public class A_add_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ;i < n ;i++ ){
            String f = Integer.toString(sc.nextInt());
            int u = f.charAt(0)-'0'+ f.charAt(1)-'0';
            System.out.println(u);
        }
        sc.close();
    }
}
