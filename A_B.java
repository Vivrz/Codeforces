package Codeforces;
import java.util.Scanner;
public class A_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        sc.nextLine();
        for(int i = 0 ;i < n ;i++){
            String result = sc.nextLine();
            sum = 0;
            for(int j = 0 ;j < result.length() ;j++){
                if(result.charAt(j) != '+'){
                    sum = sum + Character.getNumericValue(result.charAt(j));
                }
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
