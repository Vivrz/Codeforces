package Codeforces;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class Learn_Math {
    public static boolean check(int h){
        for(int k = 2;k*k <= h ;k++ ){
            if(h % k == 0 && k!= h  ){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> v = new ArrayList<>();
        int l = 4;
        Set<Integer> c = new HashSet<>();
        while(l < n){
            if(check(l)){
                v.add(l);
                c.add(l);
            }
            l++;
        }
        for(int i = 0 ;i < v.size() ;i++    ){
            int f = n - v.get(i);
            if(c.contains(f)){
                System.out.println(f+" "+v.get(i));
                break;
            }
        }
        sc.close();
    }
}
