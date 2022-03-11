import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        ArrayList<String> ans=gss(str);
       
            System.out.print(ans);
        

    }

    //Expectation-> gss(abc)=>[---,--c,-b-,-bc] +[a--,a-c,ab-,abc]
    //Faith-> gss(bc) =>   [--,-c,b-,bc]
    //Ewf-->  gss(abc)=>   x-gss(bc) + a-gss(bc)
    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> bres=new ArrayList<>(); 
            bres.add("");
            return bres;
        }

        char ch=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String> rres=gss(ros);// This is getting arraylist containing 2^(n-1) elements T(n-1)
        ArrayList<String> mres=new ArrayList<>();

        for(String rstr:rres){  // rres arraylist contains 2^(x-1) elements so loop will go 2^(x-1) times so k.2^(x-1)
            mres.add(""+rstr);
        }

        for(String rstr:rres){  // rres arraylist contains 2^(x-1) elements so loop will go 2^(x-1) times so k.2^(x-1)
            mres.add(ch+rstr);
        }

        return mres;

    }

}