import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        displayArr(arr,0);
    }
    
    
    //Expectation- da(arr,0)-> 10 20 30 40 50 
    //Faith - da(arr,1)->         20 30 40 50
    //Epect weds Faith - da(arr,0)-> 10 da(arr,1)
    public static void displayArr(int[] arr, int idx){
        if(idx==arr.length){
            return;
        }
        System.out.println(arr[idx]);
        displayArr(arr,idx+1);
    }

}