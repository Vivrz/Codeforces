package Codeforces;
import java.util.*;
public class Chewbacca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n  =sc.nextLong();
        String b = Long.toString(n);
        StringBuilder f = new StringBuilder();
        if(b.charAt(0) == '9'){
            f.append(b.charAt(0));
        }
        else{
            int r =  9 - Integer.parseInt(b.charAt(0)+"");
            if(r > Integer.parseInt(b.charAt(0)+"")){
                f.append(b.charAt(0));
            }
            else{
                f.append(r+"");
            }
        }
        for(int  i = 1 ; i < b.length();i++){
            int s = 9 - Integer.parseInt(b.charAt(i)+"");
            if(s > Integer.parseInt(b.charAt(i)+"")){
                f.append(b.charAt(i));
                continue;
            }
            else{
                f.append(s+"");
            }
        }
        String w = new String(f);
        if(w.equals("0")){
            System.out.println(b);
        }
        else{
        System.out.println(w);
        }
        sc.close();
    }
}
