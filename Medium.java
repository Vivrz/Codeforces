package Codeforces;
import java.util.Scanner;
import java.util.*;
public class Medium {
    public static void find(int arr [] , List<Integer> v){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int r : arr){
            min = Math.min(min , r);
            max = Math.max(max , r);
        }
        for(int u : arr){
            if(u != min && u != max){
                v.add(u);
                break;
            }
            else{
                continue;
            }
        }
    }
    public static void main(String[] args) {
        List<Integer> v = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ;i < n ;i++){
            int first = sc.nextInt();
            int sec = sc.nextInt();
            int thr = sc.nextInt();
            int arr [] = new int[3];
            arr[0] = first;
            arr[1] = sec;
            arr[2] = thr;
            find(arr, v);
        }
        for(int y : v){
            System.out.println(y);
        }
        sc.close();;
    }
}
