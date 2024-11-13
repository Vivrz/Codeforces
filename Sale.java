package Codeforces;
import java.util.*;
public class Sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int y [] = new int[n];
        for(int i = 0;i < y.length ;i++){
            y[i] = sc.nextInt();
        }
        Arrays.sort(y);
        int sum = 0;
        int u = 0;
        int c = 0;
        while(u < y.length){
            if(y[u] < 0){
                sum = sum + Math.abs(y[u]);
                c++;
                if(c == a){
                    break;
                }
            }
            u++;
        }
        System.out.println(sum);
        sc.close();
    }
}
