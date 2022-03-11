import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        printEncodings(st,"");
        
    }

    public static void printEncodings(String str,String asf) {
        
        if(str.length()==0){
            System.out.println(asf);
            return;
        }

      else  if(str.length()==1){
            if(str.charAt(0)=='0'){
                return ;
            }
            else{
                char ch=str.charAt(0);
                int chv=ch-'0';
                char chh=(char)('a'+chv-1);
                asf=asf+chh;
                System.out.println(asf);
                

            }
        }
        else{
            char ch=str.charAt(0);
            
            String roq=str.substring(1);
            if(ch=='0'){
                return;
            }
            else{
                
                int chv=ch-'0';
                char chh=(char)('a'+chv-1);
                ;
               printEncodings(roq,asf+chh);

            }

            String ch1=str.substring(0,2);
            String sb=str.substring(2);
            int chn=Integer.parseInt(ch1);
            if(chn<=26){
                char chh=(char)('a'+chn-1);
                // asf=asf+chh;
                printEncodings(sb,asf+chh);
            }



        }
    }

}