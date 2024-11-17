package Codeforces;
import java.util.Scanner;
public class Short_Cut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ;i < n ; i++){
            String h = sc.nextLine();
            StringBuilder f = new StringBuilder();
            for(int j = 0 ; j < h.length() ; j++){
                if(j % 2 == 0){
                    f.append(h.charAt(j));
                }
            }
            f.append(h.charAt(h.length()-1));
            System.out.println(f.toString());
        }
        sc.close();
    }
}
