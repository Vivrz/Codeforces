package Codeforces;
import java.util.Scanner;
public class Restoring_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h [] = new int[4];
        for(int i = 0 ;i < 4 ; i++){
            h[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int y : h){
            max = Math.max(max , y);
        }
        for(int b : h){
            if(b != max){
                System.out.print(max -b + " ");
            }
            else{
                continue;
            }
        }
        sc.close();
    }
}
