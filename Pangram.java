package Codeforces;
import java.util.*;
public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine().toLowerCase();
        boolean b = true;
        for(char i = 'a' ; i <= 'z' ;i++){
            if(s.contains(i+"")){
                continue;
            }
            else{
                b = false;
                break;
            }
        }
        if(b == true){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
