package Codeforces;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Dislikes_Of_three {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int y [] = new int[n];
            for(int i = 0 ;i < n ;i++){
                int k = sc.nextInt();
                y[i] = k;
            }
            int max = Integer.MIN_VALUE;
            for(int c : y){
                max = Math.max(max , c);
            }
            List<Integer> u = new ArrayList<>();
        int j = 1 ;
        int b = 0;
        while(b < 3*max){
            if(j % 3 != 0 && j % 10 != 3){
                u.add(j);
            } 
            j++;
            b++;
        }
        for(int r = 0 ; r < y.length ;r++){
            System.out.println(u.get(y[r]-1));
        }
        sc.close();
    }
}
