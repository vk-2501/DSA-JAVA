import java.util.*;

public  class Main{
    public static class Node{
        int data;
        Node left;
        Node right;
    }
    
    
    public static class Pair{
        int state;
        Node node;
    }
    public static Node construct(Integer[] arr){
      Stack< Pair>st = new Stack< >();
        //make a root and push to stack
        Node root=new Node();
        root.data=arr[0];
        
        Pair rp=new Pair();
        rp.state=1;
        rp.node=root;
        
        int idx=1;
        st.push(rp);
        
        while(st.size()>0){
            Pair peekp=st.peek();
            if(peekp.state==1){
                if(arr[idx]!=null){
                    Node lc=new Node();
                    lc.data=arr[idx];
                    peekp.node.left=lc;
                    
                    Pair lf=new Pair();
                    lf.state=1;
                    lf.node=lc;
                    
                    st.push(lf);
                }
                peekp.state++;
                idx++;
            }
            else if(peekp.state==2){
                if(arr[idx] !=null){
                    Node rc=new Node();
                    rc.data=arr[idx];
                    peekp.node.right=rc;
                    
                    Pair rf=new Pair();
                    rf.state=1;
                    rf.node=rc;
                    
                    st.push(rf);
                }
                peekp.state++;
                idx++;
            }
            else if(peekp.state==3){
                st.pop();
            }
        }
        return root;
        
        
    }
    
   public static void display(Node node) {
    if(node==null){
        return;
    }
    
    String str=" <- "+node.data+" -> ";
    String lstr=(node.left==null?".":node.left.data+" ");
    String rstr=(node.right==null?".":node.right.data+" ");
    
    String ans=lstr+str+rstr;
    
    System.out.println(ans);
    
    display(node.left);
    display(node.right);
  }
  
  public static int size(Node node){
      if(node==null){
          return 0;
      }
      
      int l=size(node.left);
      int r=size(node.right);
      
     return l+r+1;
  }
  
  public static int sum(Node node){
      if(node==null){
          return 0;
      }
      
      int ls=sum(node.left);
      int rs=sum(node.right);
      
      return ls+rs+node.data;
  }
  
    public static int max(Node node){
      if(node==null){
          return Integer.MIN_VALUE;
      }
      
      int ls=max(node.left);
      int rs=max(node.right);
      
      return Math.max(Math.max(ls,rs),node.data);
  }
  
    public static int height(Node node){
      if(node==null){
          return -1;
      }
      
      int ls=height(node.left);
      int rs=height(node.right);
      
      return Math.max(ls,rs)+1;
  }

  public static void main(String[]args) {
    Integer[]arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};

    Node root = construct(arr);
    display(root);
    
    int sizeOfTree=size(root);
    System.out.println(sizeOfTree);
    
     int sumOfTree=sum(root);
    System.out.println(sumOfTree);
    
     System.out.println(max(root));
     
     
     System.out.println(height(root));
        
        
    }
}