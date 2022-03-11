import java.io.*;
import java.util.*;

public class Sum_Triangle {

    public static void main(String[] args) throws Exception {
        
        int[] A = { 1, 2, 3, 4, 5 };
        sum(A);
        

    }

    public static void sum(int[] arr) {
      //Base Case
        if(arr.length<1){
            return;
        }
    
      //Do the work
        int[] temp=new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            int x=arr[i]+arr[i+1];
            temp[i]=x;
        }
        //THIS IS PREORDER WORK
        // System.out.println(Arrays.toString(arr));
        //saath saath print hota rahega
        //op:-    1 2 3 4 5
                // 3 5 7 9
                //  8 12 16
                //  20 28
                //   48


        sum(temp);
        //THIS IS POST ORDER WORK
        // 48
        // 20 28
        // 8 12 16
        // 3 5 7 9
        // 1 2 3 4 5
        System.out.println(Arrays.toString(arr));


    }

}