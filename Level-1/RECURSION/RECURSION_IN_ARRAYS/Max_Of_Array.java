import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=maxOfArray(arr,0);
        System.out.println(ans);
    }
    //Expectation-> maxOfArray(arr,0)-10 20 30 45 6 = 45
    //Faith-> maxOfArray(arr,1)- 20 30 45 6 =45
    //Expe weds faith -> maxOfArray(arr,0)- Now comapre 45 with 10 
    public static int maxOfArray(int[] arr, int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }

        int misa=maxOfArray(arr,idx+1);// misa-> max index in smaller array
        if(arr[idx]>misa){
            return arr[idx];
        }
        else{
            return misa;
        }
    }

}