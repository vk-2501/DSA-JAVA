public static void countSort(int[] arr,int max,int min){
    int range=max-min+1;
    int ans[]=new int[arr.length];
    int farr[]=new int[range];

    //collecting all frequencies
    for(int i=0;i<arr.length;i++){
        int val=arr[i]-min;
        farr[val]++;

    }

    //far to prefix sum array
    for(int i=1;i<farr.length;i++){
        farr[i]=farr[i-1]+farr[i];
    }

    //fill the answer array
    for(int i=arr.length-1;i>=0;i--){
        int val=arr[i];
        int pos=farr[val-min];
        ans[pos-1]=val;
        farr[val-min]--;
        
    } 

    //fill the array arr
    for(int i=0;i<ans.length;i++){
        arr[i]=ans[i];
        }
}