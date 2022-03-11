import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> ans=getStairPaths(n);
        System.out.println(ans);

    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n<=0){
            ArrayList<String> bres=new ArrayList<>();
            if(n==0){
            bres.add("");
            }
            return bres;
        }
       


        ArrayList<String> nm1=getStairPaths(n-1);
        ArrayList<String> nm2=getStairPaths(n-2);
        ArrayList<String> nm3=getStairPaths(n-3);
        ArrayList<String> myres=new ArrayList<>();

        for(String nmm1:nm1){
            myres.add(1+nmm1);
        }
        
        for(String nmm2:nm2){
            myres.add(2+nmm2);
        }

        for(String nmm3:nm3){
            myres.add(3+nmm3);
        }

        return myres;

    }

}