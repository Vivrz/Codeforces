package Codeforces;
import java.util.Scanner;
public class Black_sqaure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a [] = new int[4];
        for(int i = 0 ;i < a.length;i++){
            a[i] = sc.nextInt();
        }
        sc.nextLine();
        String h = sc.nextLine();
        int j = 0;
        int c = 0;
        int u = 0;
        while(c < h.length()){
            j = Character.getNumericValue(h.charAt(c));
            u = u + a[j-1];
            c++;
        }
        System.out.println(u);
        sc.close();
    }
}
