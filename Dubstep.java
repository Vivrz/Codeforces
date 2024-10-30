package Codeforces;
import java.util.Scanner;
public class Dubstep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String r = sc.next();
        r = r.replaceAll("WUB", " " );
        r = r.trim();
        System.out.println(r);
        sc.close();
    }
}
