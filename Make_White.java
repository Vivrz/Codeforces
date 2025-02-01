package Codeforces;
import java.util.Scanner;
public class Make_White {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ;i < n ;i++){
            int y = sc.nextInt();
            String h = sc.next();
            int c =0;
            int u = h.indexOf("B");
                int t = h.lastIndexOf("B");
                int g = u;
                if(u != -1){
                    while(g <= t){
                        if(h.charAt(g) == 'B' || h.charAt(g) == 'W'){
                            c++;
                        }
                        g++;
                    }
                }
            System.out.println(c);
        }
        sc.close();
    }
}
