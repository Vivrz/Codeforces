package Codeforces;
import java.util.*;
public class Harshit{
    public static void main(String[] args) {
        TreeMap<Integer , Integer> v = new TreeMap<>();
        TreeSet<Integer> b = new TreeSet<>();
        int a[] = {7,1,1,1,5,1,2,2,4,4,4,8};//1 -> 5 , 2 -> 2 , 4 -> 4
        for(int y : a){
            v.put(y , v.getOrDefault(y , 0 )+1);
            b.add(y);
        }
        for(int h : a){
            if(h == 2){
                System.out.println(v.get(h));
                break;
            }
        }
        System.out.println(v);
        System.out.println(b);
    }
}