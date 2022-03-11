import java.util.*;
class Triplet_Sum_Pair{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int tar=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        for(int i=0;i<n;i++){
            int x=tar-arr[i];
            int st=i+1;
            int e=n-1;

            while(st<e){
                if(arr[st]+arr[e]<x){
                    st++;
                }

                else if(arr[st]+arr[e]>x){
                    e--;
                }
                else{
                    System.out.println(arr[i]+" "+arr[st]+" "+arr[e]);
                    st++;
                    e--;
                }
            }
        }
    }

}