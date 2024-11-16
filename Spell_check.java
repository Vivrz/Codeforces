package Codeforces;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
    public class Spell_check {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n  =sc.nextInt();
            String k = "Timur";
            for(int i = 0 ;i < n ;i++){
                int m = sc.nextInt();
                sc.nextLine();
                String h = sc.nextLine();
                Set<Character> d = new HashSet<>();
                int c = 0;
                boolean x = true;
                if(h.length() != k.length()){
                    System.out.println("NO");
                    continue;
                }
                for(int j  = 0 ;j < h.length() ; j++){
                    if(!d.contains(h.charAt(j))&& k.contains(h.charAt(j)+"")){
                        d.add(h.charAt(j));
                        c++;
                    }
                    else{
                        x = false;
                        System.out.println("NO");
                        break;
                    }
                }
                if(c == k.length() && x == true){
                    System.out.println("YES");
                }
            }
            sc.close();
        }
    }
