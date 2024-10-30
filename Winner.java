package Codeforces;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Winner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a [] = new String[n];
        int k [] = new int[n];
        for(int i = 0 ; i < n ;i++){
            a[i]= sc.next();
            k[i] = sc.nextInt();
        }
        Map<String , Integer> v = new HashMap<>();
        for(int j = 0 ; j < a.length ; j++){
            if(v.containsKey(a[j])){
                k[j] += v.get(a[j]);
                v.put(a[j] , k[j]);
            }
            else{
                v.put(a[j] , k[j]);
            }
        }
        int max = Collections.max(v.values());
        for(int i = 0 ;i < n ;i++){
            if(v.get(a[i])==max && max <= k[i]){
                System.out.println(a[i]);
                break;
            }
        }
        sc.close();
    }

}
