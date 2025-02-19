package Codeforces;
import java.util.HashMap;
import java.util.Scanner;
public class Two_gram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();

        String str = sc.nextLine();

        HashMap<String , Integer> map = new HashMap<>();

        int maxFreq = Integer.MIN_VALUE;

        for(int i = 0 ;i < str.length()-1 ;i++){
            String s = str.substring(i, i+2);
            map.put(s , map.getOrDefault(s , 0) + 1);

            if(map.get(s) > maxFreq){
                maxFreq = map.get(s);
            }
        }

        String d = "";

        for(String h : map.keySet()){
            if(map.get(h) == maxFreq){
                d = h;
                break;
            }
        }
        
        System.out.println(d);

        sc.close();

    }
}