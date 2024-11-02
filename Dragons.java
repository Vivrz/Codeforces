package Codeforces;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Dragons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int lvl = sc.nextInt();
        int y [][] = new int[lvl][2];
        for(int i = 0 ;i < y.length ;i++){
            y[i][0] = sc.nextInt();
            y[i][1] = sc.nextInt();
        }
        int i =0;
        int u =0;
        int d = 0;
        Set<Integer> f = new HashSet<>();
        boolean m = false;
        while(i < y.length){
            if(y[i][0] < s && !f.contains(y[i][0])){
                s = s + y[i][1];
                f.add(y[i][0]);
                d++;
                m = true;
                if(d == lvl){
                    System.out.println("YES");
                    break;
                }
            }
            else{
                u++;
                m = false;
                if(u == lvl){
                    System.out.println("NO");
                    break;
                }
            }
           if(m == true){
                i = 0;
           }
           else{
            i++;
           }
        }
        sc.close();
    }
}
