package Codeforces;

import java.util.Arrays;

public class Sort_by_freq {
    public static void main(String[] args) {
        String s = "tree";
        char a [] = s.toCharArray();
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        // StringBuilder f = new StringBuilder();
        // for(int i = 0 ;i < a.length ;i++){
        //     f.append(a[i]);
        // }
        // System.out.println(f.toString());
    }
}
