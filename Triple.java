// package Codeforces;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Triple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ;i < n ;i++){
            int m = sc.nextInt();
            sc.nextLine();
            Map<Integer , Integer> v = new HashMap<>();
            for(int j = 0 ;j < m ;j++){
                int y = sc.nextInt();
                v.put(y , v.getOrDefault(y , 0) +  1);
            }
            boolean c = true;
            for(int u : v.keySet()){
                if(v.get(u) >= 3){
                    c = false;
                    System.out.println(u);
                    break;
                }
            }
            if(c == true){
                System.out.println(-1);
            }   
        }
        sc.close();
    }
}
