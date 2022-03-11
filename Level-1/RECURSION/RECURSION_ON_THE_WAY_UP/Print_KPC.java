import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        printKPC(s,"");
    }
     
    static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printKPC(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        
        char ch=str.charAt(0);
        String ros=str.substring(1);

        String code=codes[ch-48];
        for(int i=0;i<code.length();i++){
            printKPC(ros,asf+code.charAt(i));

        }


    }

}