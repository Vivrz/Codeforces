package Codeforces;
import java.util.Arrays;
import java.util.Scanner;
public class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int a [] = new int[n];
        int sum = 0;
        for(int i = 0 ;i < n ;i++){
            int b = sc.nextInt();
            a[i] = b;
            sum = sum + a[i];
        } 
        Arrays.sort(a);
        int c = 0;
        int max = 0;
        for(int i = a.length-1 ; i >= 0 ;i--){
            if(a.length == 1){
                System.out.println(1);
                break;
            }
            max = max + a[i];
            if(max > (sum - max )){
                c++;
                System.out.println(c);
                break;
            }
            else{
                c++;
            }
        }
        sc.close();
}
}