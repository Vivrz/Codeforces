package Codeforces;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

    
public class Most_Ocurr {
    public static int check(int input1 [] ){
        String d=  "";
        for(int s : input1){
            d = d + Integer.toString(s);
        }
        Set<Integer> g = new HashSet<>();
        for(char t : d.toCharArray()){
            g.add(Integer.parseInt(t+""));
        }
        Map<Integer , Integer> v = new HashMap<>();
        for(char b : d.toCharArray()){
            int i = Character.getNumericValue(b);
            v.put(i, v.getOrDefault(i,0) + 1);
        }
        int max = 0;
        for(int w : g){
            max = Math.max(max , v.get(w));
        }
        List<Integer> c = new ArrayList<>();
        for(int q : g){
            if(max == v.get(q) ){
                c.add(q);
            }   
        }
        int m = 0;
        if(c.size() >1){
            for(int k : c){
                m = Math.max(m , k);
            }
            return m;
        }
        return c.get(0);
    }
    public static void main(String[] args) {
        int arr [] = {122237 , 62 , 666 , 140};
        System.out.println(check(arr));
    }
}
