package Codeforces;

import java.util.Scanner;

public class Marathin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int a[] = new int[4];
        int c = 0;
        for (int i = 0; i < n; i++) {
            a[0] = sc.nextInt();
            a[1] = sc.nextInt();
            a[2] = sc.nextInt();
            a[3] =sc.nextInt();
            for (int j = 1; j < a.length; j++) {
                if (a[j] > a[0]) {
                    c++;
                }
            }
            System.out.println(c);
            c = 0;
        }
        sc.close();
    }
}
