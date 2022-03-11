import java.util.*;

class Seive_Of_Eratosthenis{
 public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
    boolean arr[]=new boolean[n+1];

    for(int i=2;i*i<arr.length;i++){

        if(arr[i]==false){
            for(int j=i;j*i<arr.length;j++){
                arr[i*j]=true;
            }
        }

    }

    for(int i=2;i<arr.length;i++){
        if(arr[i]==false)
        System.out.println(i);
    }

    
 }      
    
}


