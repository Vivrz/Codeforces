package Codeforces;
import java.util.*;
public class Chat_room {
    public static boolean check(String d , String s){
        StringBuilder c = new StringBuilder(d);
        int i = 0;
        for(char w : d.toCharArray()){
           
            while(i < s.length()){
                if(w == s.charAt(i)){
                    c.deleteCharAt(0);
                    i++;
                    break;
                }
                else{
                    i++;
                }
            }
        }
        if(c.length() == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  = sc.nextLine();
        String d = "hello";
        if(check(d, s)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
