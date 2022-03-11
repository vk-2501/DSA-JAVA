import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
    }

    public static int power(int x, int n){
       if(n==0) return 1;
       int fm1=power(x,n/2);
       int ans=fm1*fm1;

       //If n is negative 
       if(n<0){
            x=1/x;
       }

       if(n%2==1){
           ans=ans*x;
       }
       return ans;
       
    }

}