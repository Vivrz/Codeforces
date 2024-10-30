package Codeforces;
import java.util.*;
public class Easy_problem {
    public static boolean check(String s){
        for(char e : s.toCharArray()){
            if(e == '0' ){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        for(int i = 0 ;i < n ;i++){
            int g = sc.nextInt();
            s = s + g;
        }
        if(check(s)){
            System.out.println("EASY");
        }
        else{
            System.out.println("HARD");
        }
        sc.close();
    }
}
