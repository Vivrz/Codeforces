package Codeforces;
import java.util.*;
public class Stair_Peak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ;i < n ;i++){
            int h = sc.nextInt();
            int  l = sc.nextInt();
            int y = sc.nextInt();
            //peak:->
            if(h < l && l < y){
                System.out.println("STAIR");
                continue;
            }
            else if(h < l && l > y){
                System.out.println("PEAK");
                continue;
            }
            else{
                System.out.println("NONE");
            }
        }
        sc.close();
    }
}
