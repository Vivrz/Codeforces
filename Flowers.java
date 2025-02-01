package Codeforces;
import java.util.Scanner;
public class Flowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int arr [] = new int[n];
        for(int i = 0 ;i < n ;i++){
            int num = sc.nextInt();
            arr[i] = num;
        }

        int max = Integer.MIN_VALUE;

        for(int k = 0 ;k < arr.length -1  ;k++){
            for(int l = k + 1 ;l < arr.length ;l++){
                int u = Math.abs(arr[k]-arr[l]);
                max = Math.max(max , u);
            }
        }

         n = 0;
        for(int i = 0 ;i < arr.length-1 ;i++){
            for(int j = i + 1 ; j < arr.length ;j++){
                    if(Math.abs(arr[i]-arr[j]) == max){
                        n++;
                    }
            }
        }
        System.out.println(max + " " + n);
        sc.close();
    }
}
