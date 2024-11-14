package Codeforces;
import java.util.*;
public class Spy_detected {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 0 ;i < n ;i++){
        int m = sc.nextInt();
        int a [] = new int[m];
        for(int j = 0; j < m ;j++){
            a[j] = sc.nextInt();
        }
        
        Map<Integer , Integer> v = new HashMap<>();
        for(int k = 0 ;k < a.length ;k++){
            v.put(a[k] , v.getOrDefault(a[k] , 0) +1);
        }
        for(int h = 0;h<a.length;h++){
            if(v.get(a[h]) == 1){
                System.out.println(h+1);
            }
        }
    }
    sc.close();
}
}
