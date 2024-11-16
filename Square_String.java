package Codeforces;
import java.util.Scanner;
public class Square_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n ;i++){
            String a = sc.nextLine();
            if(a.length() == 1 || a.length()%2!=0){
                System.out.println("NO");
                continue;
            }
            boolean z = true;
            for(int q = 0 , r = a.length()/2 ;q < a.length()/2 && r < a.length() ; q++,r++  ){
                if(a.charAt(q) == a.charAt(r)){
                    continue;
                }
                else{
                    z = false;
                    break;
                }
            }
            if(z == true){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
