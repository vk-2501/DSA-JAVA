import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pzz(n);
        
    }

    //Expecation:- 3 211121112 3 211121112 3
    //Faith:-      2 111 2 111 2
    //Exp Weds Faith:- 3 pzz(n-1) 3 pzz(n-1) 3
    public static void pzz(int n){
        if(n==0){
            return;
        }
        
        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");
        
    }

}