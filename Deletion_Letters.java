package Codeforces;

import java.util.Scanner;

public class Deletion_Letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String h = sc.nextLine();
            int c1 = 0;
            int c2 = 0;
            int c = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) != h.charAt(0)) {
                    c++;
                } 
                else if(s.charAt(j) == h.charAt(0)){
                    if(c1 == 0){
                        c1 = c;
                        c = 0;
                    }
                }
            }
            c2 = c;
            if (c1 == c2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}