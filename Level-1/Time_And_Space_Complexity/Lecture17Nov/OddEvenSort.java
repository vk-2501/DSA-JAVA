import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int i=0;
        int j=0;
        while(i<arr.length){
            if(arr[i]%2!=0){
                i++;
            }
            else{
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
                i++;
                j++;
            }
        }
    }
}

/*
7 2 5 9 4 3 2 10



*/