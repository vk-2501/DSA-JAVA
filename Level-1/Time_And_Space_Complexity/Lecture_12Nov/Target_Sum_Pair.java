import java.util.*;

class Target_Sum_Pair{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int tar=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        int left=0;
        int rig=n-1;
        while(left<rig){
            if(arr[left]+arr[rig]==tar){
                System.out.println(arr[left]+ " "+arr[rig]);
                left++;
                rig--;
            }
            else if(arr[left]+arr[rig]>tar){
                rig--;
            }
            else{
                left++;
            }
        }
    }
}