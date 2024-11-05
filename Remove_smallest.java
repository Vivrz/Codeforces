package Codeforces;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Remove_smallest {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    for(int i = 0 ;i < n ; i++){
        boolean o = false;
        int l = sc.nextInt();
        List<Integer> v = new ArrayList<>();
        for(int j = 0 ; j < l;j++){
            v.add(sc.nextInt());
        }
        Collections.sort(v);
        for(int k = 0 ; k < v.size()-1 ;k++){
            if(Math.abs(v.get(k) - v.get(k+1)) > 1 ){
                o = true;
                break;
            }
        }
        if(o == true){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
        v.clear();
    }
    sc.close();
    }
}
