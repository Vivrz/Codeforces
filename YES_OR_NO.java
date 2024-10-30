package Codeforces;
import java.util.*;
public class YES_OR_NO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String h [] = new String[n];
        for(int i = 0 ; i < n ;i++){
            h[i] = sc.nextLine();
        }
        String g = "YES";
        for(String j : h){
            if(g.equals(j.toUpperCase())){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
