package Codeforces;
import java.util.Scanner;
public class Love_story {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String v = "codeforces";
        for(int i = 0 ;i < n ;i++){
            String h = sc.nextLine();
            int c = 0;
            for(int j  = 0 ;j < 10;j++){
                if(v.charAt(j) != h.charAt(j)){
                    c++;
                }
            }
            System.out.println(c);
        }
        sc.close();
    }
}
