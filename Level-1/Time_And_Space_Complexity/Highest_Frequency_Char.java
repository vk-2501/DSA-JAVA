import java.util.*;
class Highest_Frequency_Char{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    String str=sc.nextLine();

    int[] far=new int[26];
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        int idx=ch-'a';
        far[idx]++;
    }

    int max=0;
    for(int i=1;i<far.length;i++){
        if(far[i]>far[max]){
            max=i;
        }
    }

    char chf=(char)(max+'a');
    System.out.println(chf + " " +far[max]);
}
}