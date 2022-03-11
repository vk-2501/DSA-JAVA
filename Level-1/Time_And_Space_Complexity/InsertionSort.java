import java.util.*;

class InsertionSort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=1;i<=n-1;i++){
            for(int j=i-1;j>=0;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
                break;
            }
        }

        for(int i=0;i<n;i++){
           System.out.print(arr[i]);
        }
    }
}