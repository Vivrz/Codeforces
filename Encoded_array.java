package Codeforces;
public class Encoded_array {
    public static int[] encoded(int input1 [] , int input2){
        int d [] = new int[input2];
        d[0] = input1[input2-1];
        int u  = input2 -2;//4
        int h = 0;
        for(int i = u ; i >= 0 ;i--){
            int y = input1[i] - d[h];
            d[++h] = y;
        }
        int sum = 0;
        for(int  g : d){
            sum += g;
        }
        return d;
    }
    public static void main(String[] args) {
        int en [] = {7,6,8,16,12,3};
        int sum = 0;
        for(int  g : encoded(en , en.length)){
            sum += g;
        }
        System.out.println(sum);
    }
}
