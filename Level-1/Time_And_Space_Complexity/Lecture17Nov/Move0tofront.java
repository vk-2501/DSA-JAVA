// Move all 0's to front , preserving the relative order of the non-zero elements

import java.util.*;

class Move0tofront{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int i=arr.length-1;
        int j=arr.length-1;

        while(i>=0){
            if(arr[i]==0){
                i--;
            }
            else{
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
                i--;
                j--;


            }
        }

        //print the array
        for(int h=0;h<n;h++){
            System.out.println(arr[h]+"");
        }
    }
}