public static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2) {
    // write your code hered
    
    LinkedList res=new LinkedList();
    
    Node h1=l1.head;
    Node h2=l2.head;
    
    while(h1!=null && h2!=null){
        if(h1.data<h2.data){
            res.addLast(h1.data);
            h1=h1.next;
        }
        
        else{
             res.addLast(h2.data);
            h2=h2.next; 
        }
    }
    
    if(h1==null){
        while(h2!=null){
             res.addLast(h2.data);
            h2=h2.next; 
        }
        }
        
    
    else{
         while(h1!=null){
             res.addLast(h1.data);
            h1=h1.next; 
        }
        
    }
    
    return res;
}