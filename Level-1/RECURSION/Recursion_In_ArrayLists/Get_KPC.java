import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        ArrayList<String> ans=getKPC(str);
        System.out.println(ans);
    }

     static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    //Expec->
    public static ArrayList<String> getKPC(String str) {

        if(str.length()==0){
            ArrayList<String> bres= new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch=str.charAt(0);
        String ros=str.substring(1);
        
        ArrayList<String> rres=getKPC(ros);
        ArrayList<String> myres= new ArrayList<>();
        
        int j=ch-48;
        String code=codes[j];

        for(int i=0;i<code.length();i++){
            char chr=code.charAt(i);
            for(String myrst:rres){
                myres.add(chr+myrst);
            }
        }


        return myres;

        
    }

}