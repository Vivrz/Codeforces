package Codeforces;
import java.util.Scanner;
public class Borze_code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String c = sc.nextLine();
    String f = "";
    String x = "";
    for(char e : c.toCharArray()){
        x = x + e+"";
        if(x.equals('.'+"")){
            f = f + "0";
            x = "";
        }
        else if(x.equals("-.")){
            f = f + "1";
            x = "";
        }
        else if(x.equals("--")){
            f = f + "2";
            x = "";
        }
        else{
            continue;
        }
    }
    System.out.println(f+"");
    sc.close();
    }
}

