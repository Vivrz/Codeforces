package Codeforces;
import java.util.Arrays;
import java.util.Scanner;
public class Meeting_Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g [] = new int[3];
        int f [] = new int[3];
        
        for(int i = 0 ;i < f.length ; i++){
            f[i] = sc.nextInt();
        }
        g[0] = Math.abs(f[0]- f[2]);
        for(int i = 1 ; i< f.length ;i++){
            g[i] =Math.abs(f[i] - f[i-1]);
        }
        Arrays.sort(g);
        System.out.println(g[0]+g[1]); 
        sc.close();
    }
}
