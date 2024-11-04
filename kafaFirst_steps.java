package Codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class kafaFirst_steps {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         List<Integer> v = new ArrayList<>();
         for(int i = 0 ;i < n ;i++){
            v.add(sc.nextInt());
         }
         int c = 1;
         int max = Integer.MIN_VALUE;
         if(v.size() == 1){
            System.out.println(v.size());
         }
         else{
         for(int i = 1 ; i < v.size() ;i++){
            
            if(v.get(i) >= v.get(i-1)){
                c++;
                max = Math.max(max ,c );
            }
            else{
                c = 1;
            }
         }
         if(max == Integer.MIN_VALUE){
            System.out.println(1);
         }
         else{
            System.out.println(max);
         }
        }
         sc.close();
    }
}
