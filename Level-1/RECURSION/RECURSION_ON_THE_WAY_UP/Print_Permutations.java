import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        printPermutations(st,"");
    }

    public static void printPermutations(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
                }

       for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           String prei=str.substring(0,i);
           String poei=str.substring(i+1);

           printPermutations(prei+poei,asf+ch);


       }

    }

}