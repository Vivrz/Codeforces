package Codeforces;
import java.util.Arrays;
import java.util.Scanner;
public class Sorting_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ;i < n ;i++){
                int y = sc.nextInt();
                int u = sc.nextInt();
                int b []  = new int[2];
                b[0] = y;
                b[1] = u;
                Arrays.sort(b);
                System.out.print(b[0] + " ");
                System.out.print(b[1]);
            
            System.out.println();
        }
        sc.close();
    }
}
