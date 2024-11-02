package Codeforces;
import java.util.Scanner;
public class Sum {
    public static String check(int [] r){
        if((r[0] + r[2] ) == r[1]){
            return "YES";
        }
        if((r[0] + r[1]) == r[2]){
            return "YES";
        }
        else if((r[1]+r[2]) == r[0]){
            return "YES";
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0 ;i < num ;i++){
            int r [] = new int[3];
            for(int j = 0 ; j < 3 ;j++){
                r[j] = sc.nextInt(); 
                
            }
            System.out.println(check(r));
        }
        sc.close();
    }
}
