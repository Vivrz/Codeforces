package Codeforces;
import java.util.Scanner;
public class Word_paper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("\n");
        for(int i = 0 ;i < n ;i++){
            String l = "";
            String r = "";
            for(int k = 0 ;k < 8 ;k++){
                String h = sc.nextLine();
                l = l + h;
            }
            for(char e : l.toCharArray()){
                if(e != '.'){
                    r = r + e;
                }
            }
            System.out.println(r);
        }
        sc.close();
    }
}
