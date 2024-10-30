package Codeforces;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Ceil {
    public static void maxKelements(int[] nums, int k) {
        List<Integer> h = new ArrayList<>();
       for(int num : nums){
            h.add(num);
       }
       Collections.sort(h);
       int l = h.get(0);
       int score = 0;
       int t = 0;
       for(int i = h.size()-1 ; i >=0 ;i--){
            while(h.get(i) >= l && t < k){
                double result = (double) h.get(i)/3;
                int  n = (int)Math.ceil(result);
                score = score + h.get(i);
                System.out.println(score);
                h.set(i , n);
                t++;
            }
       }
    }
    public static void main(String[] args) {
        int nums [] = {1,10,3,3,3};
        maxKelements(nums , 3);
    }
}
