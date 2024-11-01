package Codeforces;
import java.util.*;
public class Lucky {
    public static String check(String n){
        int i = 0;
        int sum =0;
        while(i < 3){
            sum = sum + Character.getNumericValue(n.charAt(i));
            i++;
        }
        i = n.length()-1;
        int u = 0;
        while(i >= n.length()-3){
            u = u + Character.getNumericValue(n.charAt(i));
            i--;
        }
        if(sum == u){
            return "YES";
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        sc.nextLine();
        for(int i = 0 ;i < num ;i++){
            String h = sc.nextLine();
            System.out.println(check(h));
        }
        sc.close();
    }
}
