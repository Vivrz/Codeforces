package Codeforces;
import java.util.Scanner;
public class HQ_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String h = sc.nextLine();
        String d = "HQ9";
        boolean k = false;
        for(char e : d.toCharArray()){
            if(h.contains(e+"")){
                k = true;
            }
            else{
                continue;
            }
        }
        if(k == false){
            System.out.println("NO");
        }   
        else{
            System.out.println("YES");
        }
        sc.close();
    }
}
