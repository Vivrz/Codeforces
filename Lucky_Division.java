package Codeforces;
import java.util.Scanner;
public class Lucky_Division {
    public static boolean check(String b){
        boolean m = true;
        for(int i = 0 ;i < b.length() ;i++){
            if(b.charAt(i) == '4' || b.charAt(i) == '7'){
                continue;
            }
            else{
                m = false;
            }
        }
        if(m == true){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(check(Integer.toString(n))){
            System.out.println("YES");
        }
        else{
            if(n % 4 == 0 || n % 7 == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
