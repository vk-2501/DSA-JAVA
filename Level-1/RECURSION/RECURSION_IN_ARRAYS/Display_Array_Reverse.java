import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        displayArrReverse(arr,0);
    }

    //Expec-> dar(arr,0)-> 50 40 30 20 10 
    //Faith-> dar(arr,1)-> 50 40 30 20 
    //Expe weds Faith-> dar(arr,0)-> dar(arr,1) 10
    public static void displayArrReverse(int[] arr, int idx) {
        if(idx==arr.length) return;
        displayArrReverse(arr,idx+1);
        System.out.println(arr[idx]);
    }



}

//POINTS TO BE NOTED
//1. IF your are making postorder call then it will print ulta
//2. If you are making preorder call then it will print seedha