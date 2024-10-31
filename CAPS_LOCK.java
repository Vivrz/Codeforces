package Codeforces;
import java.util.*;
public class CAPS_LOCK {
    public static boolean All_upper(String s){
        for(int i = 1 ;i < s.length() ;i++){
            if(Character.isUpperCase(s.charAt(i))){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static String change(String s){
        String q = "";
        for(char t : s.toCharArray()){
            if(Character.isUpperCase(t)){
                q = q + Character.toLowerCase(t);
            }
            else{
                q = q + Character.toUpperCase(t);
            }
        }
        return q;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(Character.isLowerCase(s.charAt(0))){
            if(All_upper(s)){
                System.out.println(change(s));
            }
            else{
                System.out.println(s);
            }
        }
        else{
            if(All_upper(s)){
                System.out.println(change(s));
            }
            else{
                System.out.println(s);
            }
        }
        sc.close();
    }
}
