package Codeforces;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int arr[] = new int[3];
            for (int j = 0; j < 3; j++) {
                int num = sc.nextInt();
                arr[j] = num;
            }
            int first = arr[0];
            int sec = arr[1];
            int h = arr[2];
            int c = 0;
            if (first > sec) {
                while (first < h) {
                    first += sec;
                    c++;
                }
                System.out.println(c);
            } else {
                while (sec < h) {
                    sec += first;
                    c++;
                }
                System.out.println(c);
            }
        }
        sc.close();
    }
}
