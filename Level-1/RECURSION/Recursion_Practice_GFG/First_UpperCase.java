import java.io.*;
import java.util.*;

public class First_UpperCase {

    public static void main(String[] args) throws Exception {
        
       String st="elllKoworld";
        sum(st);
        

    }

    public static void sum(String s) {
        if(s.length()==0){
            return ;
        }

        char ch=s.charAt(0);
        String st=s.substring(1);
        if(Character.isUpperCase(ch)==true){
            System.out.println(ch);
            return;
            
        }

        sum(st);

    }

}