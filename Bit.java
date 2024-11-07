package Codeforces;
import java.util.Scanner;
public class Bit {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    int X = 0;
    for(int i = 0 ;i < n ;i++){
        String s = sc.nextLine();
        if(s.contains("++")){
            X+=1;

        }
        else if(s.contains("--")){
            X-=1;
      
        }
    }
    System.out.println(X);
    sc.close();
}
}
