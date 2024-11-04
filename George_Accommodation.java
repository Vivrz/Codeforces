package Codeforces;
import java.util.Scanner;
public class George_Accommodation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        for(int i = 0 ;i < n ;i++){
            int h = sc.nextInt();
            int f = sc.nextInt();
            if(f >  h && (f-h) >= 2){
                counter++;
            }
            else{
                continue;
            }
        }
        System.out.println(counter);
        sc.close();
    }
}
