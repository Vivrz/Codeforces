package Codeforces;
import java.util.*;
public class Consecutive_zeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   
        for(int i = 0;i < n ;i++){
            int m = sc.nextInt();
            StringBuilder s = new StringBuilder();
            for(int j = 0;j<m;j++){
                s.append(sc.nextInt());
            }
            String h = s.toString().replaceAll("1"," ");
            int max = Integer.MIN_VALUE;
            int c = 0;
            for(int r = 0 ;r < h.length() ; r++){
                if(h.charAt(r) == '0'){
                    c++;
                    max = Math.max(max , c);
                }
                else{
                    c = 0;
                }
            }
            if(!h.contains("0")){
                System.out.println(0);
            }
            else{
                System.out.println(max);
            }
        }
        sc.close();
    }
}
