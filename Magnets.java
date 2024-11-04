package Codeforces;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> v = new ArrayList<>();
        for(int i = 0 ;i < n ;i++){
            v.add(sc.nextInt());
        }
        int c = 1;
        for(int i  =1 ;i < v.size() ;i++){
                if(v.get(i) == v.get(i-1)){
                    continue;
                }
                else{
                    c++;
                }
        }
        System.out.println(c);
        sc.close();
    }
}
