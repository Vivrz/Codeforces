package Codeforces;
//So in there is a string "World Wide Web" and in this we want to return the sum of the each word i,e. World like diff bw w and d added with diff bw o and l and then r like wise and return the concatenation value of all the words..
public class World_wide {
    public static int space(String s){
        String a [] = s.split(" ");
        String v = "";
        for(String str : a){
            int i = 0;
            int j = str.length()-1;
            int sum = 0 ;
            
            String h = str.toLowerCase();
            while(i <= j){
                if(i == j){
                    sum = sum + (h.charAt(i)-'a'+1);
                }
                else{
                sum = sum + Math.abs((h.charAt(i) - h.charAt(j)))   ;
                }
                i++;
                j--;
            }   
            v = v + sum + "";
        }
        return Integer.parseInt(v);
    }
    public static void main(String[] args) {
        String s = "Big Bang Theory";
        System.out.println(space(s));
    }
}
