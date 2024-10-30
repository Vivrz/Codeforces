package Codeforces;
public class Two_string_sum {
    public static String check(String g , String h){
        int i = g.length()-1;
        int j = h.length()-1;
        int carry  = 0;
        int sum = 0;
        String b = "";
        while(i >= 0 || j >= 0 || carry > 0){
            int s = (i>=0) ? Integer.parseInt(g.charAt(i)+"") : 0;
            int x = (j>=0) ? Integer.parseInt(h.charAt(j)+"") : 0;
            sum = carry + s + x;
            carry = sum/10;
            b = b + sum%10;
            i--;
            j--;
        }
        StringBuilder v = new StringBuilder(b);
        v.reverse();
        return v.toString();
    }
    public static void main(String[] args) {
        String g = "1234";
        String h = "56";
        System.out.println(check(g , h));
    }
}

