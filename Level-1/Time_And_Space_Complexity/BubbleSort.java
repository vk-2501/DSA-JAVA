import java.util.*;

class BubbleSort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=1;i<=n-1;i++){
            for(int j=0;j<=n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }

        for(int i=0;i<n;i++){
           System.out.println(arr[i]);
        }
    }
}