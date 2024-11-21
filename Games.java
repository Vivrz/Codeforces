package Codeforces;
import java.util.Scanner;
public class Games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int a [][] = new int[n][2];
        for(int i = 0 ;i < n ; i++){
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        int c = 0;
        for(int j = 0 ; j < n; j++ ){
            for(int k = 0 ; k < n; k++){
                if(k != j){
                    if(a[j][0] == a[k][1]){
                        c++;
                    }
                }
            }
        }
        System.out.println(c);
        sc.close();
    }
}
