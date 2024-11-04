package Codeforces;
import java.util.Scanner;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
public class Registration_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<String , Integer > v = new HashMap<>();
        Set<String> b = new HashSet<>();
        for(int i = 0 ;i < n ;i++){
            String h = sc.nextLine();
            v.put(h , v.getOrDefault(h , 0) + 1);
            if(!b.contains(h)){
                System.out.println("OK");
            }
            else{
                String l = h + (v.get(h)-1);
                System.out.println(l);
                l = "";
            }
            b.add(h);
        }
        sc.close();
    }
}
