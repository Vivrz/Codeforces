package Codeforces;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Balanced_array {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    for(int i = 0 ;i < n ;i++){
        int m = sc.nextInt();
        List<Integer> v = new ArrayList<>();
        for(int j = 1 ; j < m/2 ;j++){
            if(j % 2 == 0){
                v.add(j);
            }
        }
        for(int k = m/2+1; k < m ; k++){
            if(k % 2 == 0){
                v.add(k);
            }
        }
        int a [] = new int[v.size()];
        int y = 0;
        for(int h : v){
            a[y++] = h;
        }
        System.out.println(Arrays.toString(a));
    }
    sc.close();
    }
}
