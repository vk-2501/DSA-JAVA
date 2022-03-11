import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int n=sc.nextInt();
      int res=power(x,n);
      System.out.println(res);

    }

    public static int power(int x, int n){
        if(n==0) return 1;
        int pm1=power(x,n-1);
        int ans=pm1*x;
        return ans;
    }

}