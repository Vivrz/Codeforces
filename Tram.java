package Codeforces;
import java.util.Scanner;
public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ;i < n ;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(sum == 0){
                sum = sum + b;
                max = Math.max(max , sum);
            }
            else{
                sum = sum - a + b;
                max = Math.max(max , sum);
            }
        }
        System.out.println(max);
        sc.close();
    }
}
