import java.io.*;
import java.util.*;

public class Main {

  public static void radixSort(int[] arr) {
    
    //1.Find the max in array
    int max=arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }

    int place=1;
    while(max/place>0){
        countSort(arr,place);
        place=place*10;
    }

  }

  public static void countSort(int[] arr, int exp) {
    
    int farr[]=new int[10];
    int ans[]=new int[arr.length];

    //collect all frequencies
    for(int i=0;i<arr.length;i++){
        int num=(arr[i]/exp)%10;
        farr[num]++;
    }

    //make psa 
    for(int i=1;i<farr.length;i++){
        farr[i]=farr[i-1]+farr[i];
    }

    //fill the ans array
    for(int i=arr.length-1;i>=0;i--){
        int pos=farr[(arr[i]/exp )%10]-1;
        ans[pos]=arr[i];
        farr[arr[i]/exp%10]--;
    }   

    //fill the original array
    for(int i=0;i<ans.length;i++){
        arr[i]=ans[i];
    }
    
    
    
    System.out.print("After sorting on " + exp + " place -> ");
    print(arr);
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    radixSort(arr);
    print(arr);
  }

}