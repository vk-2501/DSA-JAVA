import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<String> ans=getMazePaths(1,1,n,m);
        System.out.println(ans);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
       
        if(sr==dr && sc==dc){
            ArrayList<String> bres= new ArrayList<>();
            bres.add("");
            return bres;
        }
         if(sr>dr || sc>dc){
            ArrayList<String> fres= new ArrayList<>();
            return fres;
        }

        ArrayList<String> hpaths=getMazePaths(sr,sc+1,dr,dc);
        ArrayList<String> vpaths=getMazePaths(sr+1,sc,dr,dc);
        ArrayList<String> myres= new ArrayList<>();

        for(String ht:hpaths){
            myres.add("h"+ht);
        }

        for(String vt:vpaths){
            myres.add("v"+vt);
        }

        return myres;
    }

}