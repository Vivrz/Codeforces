// package Codeforces;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Horshoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> v = new HashSet<>();
        int m = sc.nextInt();
        v.add(m);
        int c = 1;
        for(int i = 0 ;i < 3 ;i++){
            v.add(sc.nextInt());
            c++;
        }
        System.out.println(c-v.size());
        sc.close();
    }
}
