package Codeforces;
import java.util.Scanner;
public class Vlad_Best {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ;i < n ;i++){
            String h = sc.nextLine();
            int a = 0;
            int b = 0;
            for(int j = 0 ;j < h.length() ;j++){
                if(h.charAt(j) == 'A'){
                    a++;
                }
                else{
                    b++;
                }
            }
            if(a > b){
                System.out.println("A");
            }
            else{
                System.out.println("B");
            }
        }
        sc.close();
    }
}
