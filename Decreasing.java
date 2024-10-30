package Codeforces;
import java.util.ArrayList;
import java.util.List;
public class Decreasing {
    public static int  check(int input1 [] ){
        List<Integer> b = new ArrayList<>();
        int sz = 0;
        int max = 0;
        for(int i = 0 ; i< input1.length-1; i++){
            if(input1[i] > input1[i+1]){
                b.add(input1[i]);
            }
            else if(i != 0 && input1[i-1] > input1[i] ){
                b.add(input1[i]);
            }
            else{
                if(b.size()>0){
                    max = Math.max(max , b.size());
                    sz++;
                    b.clear();
                }
            }
        }
        System.out.println("Total number of decreasing sequence : " + sz);
        return max;
    }
    public static void main(String[] args) {
        int arr [] = {12,51,100,212,15,12,7,3,57,300,312,78,19,100,102,101,99,74,0,-5,1000};
        System.out.println("size of the longest sequence :" + check(arr));
    }
}
