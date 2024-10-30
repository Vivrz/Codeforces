package Codeforces;
import java.util.*;
public class Even_odds {
    public static void odds_even(int n , int k ){
        int i = 1;
        List<Integer> v = new ArrayList<>();
        while(i <= n){
            if(i % 2 != 0){
                v.add(i);
            }
            i++;
        }
        int t = 1;
        while(t <= n ){
            if(t % 2 == 0){
                v.add(t);
            }

            t++;
        }
        System.out.println(v.get(k-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k  = sc.nextInt();
        odds_even(n, k);
    }
}
