package Codeforces;
import java.util.Arrays;
import java.util.Scanner;
public class Amusing_joke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String h = a + b;
        char e [] = h.toCharArray();
        char t [] = c.toCharArray();
        Arrays.sort(e);
        Arrays.sort(t);
        a = "";
        b = "";
        for(char w : e){
            a = a + w;
        }
        for(char g : t){
            b = b + g;
        }
        if(a.equals(b)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();;
    }
}
