package Codeforces;
import java.util.Scanner;
import java.util.*;
public class Twice {
    public static void main(String args [] ){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// n = no. of test cases
        for(int i = 0 ;i < n ;i++){
            int num = sc.nextInt();
            Map<Integer , Integer> v = new HashMap<>();
            for(int  j= 0 ;j < num ;j++){
                int h = sc.nextInt();
                v.put(h , v.getOrDefault(h , 0) + 1);
            }
            int maxScore = 0;
            for(int d : v.values()){
                maxScore += d/2;
            }
            System.out.println(maxScore);
        }
        sc.close();
    }
}
