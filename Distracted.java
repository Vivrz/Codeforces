package Codeforces;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Distracted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i < n ;i++){
            int m = sc.nextInt();
            sc.nextLine();
            String g = sc.nextLine();
            g = g + "4";
            Set<Character> v = new HashSet<>();
            boolean x = true;
            for(int j = 0 ;j < g.length()-1 ; j++){
                if(g.charAt(j) == g.charAt(j+1) && !v.contains(g.charAt(j))){
                    v.add(g.charAt(j));
                    continue;
                }
                else{
                    if(v.contains(g.charAt(j)) && g.charAt(j-1) != g.charAt(j)){
                        x = false;
                        System.out.println("NO");
                        break;
                    }
                    else{
                        v.add(g.charAt(j));
                    }
                }
            }
            if(x == true){
                System.out.println("YES");
            }
        }
    }
}
