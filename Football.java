package Codeforces;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<String , Integer> v = new HashMap<>();
        String h [] = new String[n];
        for(int i = 0 ;i < n ;i++){
            String c = sc.nextLine();
            h[i] = c;
        }
        int max = Integer.MIN_VALUE;
        for(String x : h){
            v.put(x , v.getOrDefault(x , 0) + 1);
        }
        for(String q : v.keySet()){
            max = Math.max(max , v.get(q));
        }
        for(String f : v.keySet()){
            if(max == v.get(f)){
                System.out.println(f);
                break;
            }
        }
        sc.close();
    }
}
