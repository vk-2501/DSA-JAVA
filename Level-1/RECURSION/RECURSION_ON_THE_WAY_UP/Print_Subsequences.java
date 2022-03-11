import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        printSS(s,"");
    }

    public static void printSS(String str, String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        
        char ch=str.charAt(0);    // k work
        String ros=str.substring(1); //k work

        printSS(ros,ans+ch);//acceptance T(n-1){because ros has one length less than original string}
        printSS(ros,ans);   //rejection  T(n-1)

    }

}