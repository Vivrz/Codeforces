package Codeforces;
import java.util.Scanner;
public class Creating_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ;i < n ;i++){
            String a = sc.next();
            String b = sc.next();
            StringBuilder v = new StringBuilder(a);
            v.setCharAt(0, b.charAt(0));
            System.out.print(v.toString()+" ");
            v = new StringBuilder(b);
            v.setCharAt(0,a.charAt(0));
            System.out.print(v.toString());
            System.out.println();
        }
        sc.close();
    }
}
