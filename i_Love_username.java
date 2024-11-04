package Codeforces;
import java.util.Scanner;
public class i_Love_username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y [] = new int[n];
        for(int i = 0 ; i< n;i++){
            y[i] = sc.nextInt();
        }
        int min = y[0];
        int max = y[0];
        int c = 0;
        for(int i = 1 ;i < y.length ;i++){
            if(y[i] < min){
                min = y[i];
                c++;
            }
            else if(y[i] > max){
                max = y[i];
                c++;
            }
            else{
                continue;
            }
        }
        System.out.println(c);
        sc.close();
    }
}
