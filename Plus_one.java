package Codeforces;
import java.util.Scanner;
public class Plus_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ;i < n ; i++){
            int m = sc.nextInt();
            sc.nextLine();
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int j = 0; j < m ;j++){
                int l = sc.nextInt();
                min = Math.min(min , l);
                max = Math.max(max , l);
            }
            System.out.println(Math.abs(max-min));
        }
        sc.close();
    }
}
