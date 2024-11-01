package Codeforces;
import java.util.Scanner;
public class Stones_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String v = sc.next();
        int c = 0;
        for(int i = 0; i < v.length()-1 ; i++){
            if(v.charAt(i)  == v.charAt(i+1)){
                c++;
            }
            else{
                continue;
            }   
        }
        System.out.println(c);
        sc.close();
    }
}
