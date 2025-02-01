package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class Team_Olympiad {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int a[]=new int[n+1];
        for(int i=1;i<=n;i++){
            a[i]=r.nextInt();
        }
        if(a.length<=3){
            System.out.println(0);
        }
        else{
        int b[]=new int[4];
        for(int i=1;i<=n;i++){
            if(a[i]==1){
                b[1]+=1;
            }
            else if(a[i]==2){
                b[2]+=1;
            }
            else{
                b[3]+=1;
            }
        }
        int min=Math.min(b[1],b[2]);
        min=Math.min(min,b[3]);
        if(min==0){
            System.out.println(0);
        }
        else{
            System.out.println(min);
        }
        ArrayList<Integer> f=new ArrayList<>();
        while(min>0){
            int t=1;
            while(t<=3){
            for(int i=1;i<=n;i++){
                if(a[i]==t&&!f.contains(i)){
                    System.out.print(i+" ");
                    f.add(i);
                    break;
                }
                
            }
            t++;
        }
        System.out.println("");
        min--;
        }
    }}
}