package Codeforces;
import java.util.Scanner;
public class IQ_test {
    public static int check(int u , int  e [] ){
        boolean b = true;
        int o = 0;
        for(int j = 0 ;j < e.length ; j++){
            if(u != e[j] && Math.abs(e[j]-u)%2!=0){
                o = j+1;
                b = false;
                break;
            }
        }   
        if(b == false){
            return o;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e [] = new int[n];
        for(int i = 0 ; i < n ;i++){
            e[i] = sc.nextInt();
        }
        for(int a = 0 ;a < e.length ;a++){
            System.out.println(check(e[a] , e));
            break;
        }
        sc.close();
    }
}

