  
    public int kthFromLast(int k){
        // write your code here
        
        Node slow=head;
        Node fast=head;
        
        for(int i=0;i<k;i++){
            fast=fast.next;
            
        }
        
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        
        return slow.data;
      }