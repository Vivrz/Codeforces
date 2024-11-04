package Codeforces;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Anton_Letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String v = sc.nextLine();
        Set<Character> b = new HashSet<>();
        for(int i = 0 ;i < v.length() ;i++){
            if(v.charAt(i) != '{' && v.charAt(i) != ',' && v.charAt(i) != ' '){
                b.add(v.charAt(i));
            }
        }
        System.out.println(b.size()-1);
        sc.close();
    }
}
