package Codeforces;
import java.util.Scanner;
public class String_task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine().toLowerCase();
        String h = "";
        for(int i = 0 ;i < s.length() ;i++ ){
            if(s.charAt(i) != 'a'  && s.charAt(i) != 'e'  && s.charAt(i) != 'i' &&  s.charAt(i)  != 'o' &&  s.charAt(i) != 'u' && s.charAt(i) != 'y'){
                h =  h + "." +  s.charAt(i);
            }
            else{
                continue;
            }
        }
        System.out.println(h);
        sc.close();
    }
}
