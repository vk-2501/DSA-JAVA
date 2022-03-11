import java.io.*;
import java.util.*;

public class Merge_two_sorted_arrays {

  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    
    int arr[]=new int[a.length+b.length];
    int i=0;
    int j=0;
    int k=0;
    while(i<a.length && j<b.length){
        if(a[i]<b[j]){
            arr[k]=a[i];
            i++;
            k++;
        }
        else{
          arr[k]=b[j];
            j++;
            k++;

        }
    }
    if(i==a.length){
        while(j<b.length){
        arr[k]=b[j];
        k++;
        j++;
        }
    }
    else{
          while(i<a.length){
        arr[k]=a[i];
        k++;
        i++;
        }
        
    }
    
    
    return arr;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n; i++){
      a[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int[] b = new int[m];
    for(int i = 0 ; i < m; i++){
      b[i] = scn.nextInt();
    }
    int[] mergedArray = mergeTwoSortedArrays(a,b);
    System.out.println("The sorted array is");
    print(mergedArray);
  }

}