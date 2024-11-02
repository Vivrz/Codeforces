package Codeforces;
import java.util.Scanner;
public class Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a + b + c;
        int g = a*b*c;
        int r = a*(b+c);
        int j = a+(b*c);
        int y = (a + b)*c;
        int i = (a*b) + c;
        int max = Math.max(sum , g);
        max = Math.max(max , y);
        max = Math.max(max , i);
        max = Math.max(max , r);
        max = Math.max(max , j);
        System.out.println(max);
        sc.close();
    }
}
