package Codeforces;
import java.util.Scanner;
public class Fair_division {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    for(int i = 0 ;i < n ;i++){
        int m = sc.nextInt();
        sc.nextLine();
        int u = 0;
        int al= 0;
        int bo = 0;
        for(int j = 0 ;j < m ; j++){
            int a = sc.nextInt();
            if(a == 1){
                al++;
                u = u + a;
            }
            else{
                bo++;
                u = u + a;
            }
        }
        if(u % 2 == 0 && al % 2 == 0 && al > 0){
            System.out.println("YES");
        }
        else if(u % 2 == 0 && bo % 2 ==0  && bo > 0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    sc.close();
    
    }
}
