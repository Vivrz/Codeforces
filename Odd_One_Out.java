package Codeforces;

import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;
public class Odd_One_Out {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ;i < n ;i++){
            Map<Integer , Integer > v = new HashMap<>();
            for(int j = 0 ; j < 3 ;j++){
                int u = sc.nextInt();
                v.put(u, v.getOrDefault(u , 0 )   +1);
            }
            for(int g : v.keySet()){
                if(v.get(g) == 1){
                    System.out.println(g);
                    break;
                }
            }
        }
        
        sc.close();
    }
}
