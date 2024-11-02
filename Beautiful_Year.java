package Codeforces;
import java.util.*;
public class Beautiful_Year {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int y = sc.nextInt();
            int i = y+1;
            boolean f = true;
            while(i <= 9000000){
                
                String c = Integer.toString(i);
                String x = "";
                for(int j = 1 ;j < c.length();j++){
                    if(c.charAt(j-1) != c.charAt(j) && !x.contains(c.charAt(j)+"")){
                        x = x + c.charAt(j-1);
                        continue;
                    }
                    else{
                        f = false;
                        break;
                    }
                }
                if(f == true){
                    System.out.println(i);
                    break;
                }
                else{
                    f = true;
                    i++;
                }
            }
            sc.close();
        }
}