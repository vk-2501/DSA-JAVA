
// 1.x^n + 2.x^(n-1) + 3.x^(n-2) + ....................+ n.x^1

import java.util.*;

class Polynomial{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int ans=0;
        int c=n;
        int pox=x;
        while(c>=1){
            int term=c*pox;
            ans=ans+term;
            c--;
            pox=pox*x;

        }
        System.out.println(ans);
    }
    
}