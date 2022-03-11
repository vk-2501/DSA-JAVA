import java.util.*;

class Check_Duplicate{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

     Arrays.sort(arr);
     int dup=-1;
     for(int i=0;i<arr.length-1;i++){
         if(arr[i]==arr[i+1]){
            dup=arr[i];
            break;
         }
     }

      
           System.out.println(dup);
        
    }
}