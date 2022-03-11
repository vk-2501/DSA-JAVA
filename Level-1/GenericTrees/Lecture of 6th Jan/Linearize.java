import java.util.*;

public class Linearize {
    public static class Node{
        int data;
        ArrayList<Node> children=new ArrayList<>();//bhoolna mat

        Node(int data){
            this.data=data;
        }

    }

    

  
    public static void linearize(Node node){
        // write your code here
        if(node.children.size()==0)
        return;
    
        for(Node child:node.children){
          linearize(child);
    
        }
    
        while(node.children.size()>1){
          Node last=node.children.remove(node.children.size()-1);
          Node slast=node.children.get(node.children.size()-1);
    
          Node stail=tail(slast);
    
          stail.children.add(last);
        }
    
    
        //request your child to get linearize
    }

    public static Node tail(Node node){
        while(node.children.size()>0){
          node=node.children.get(0);
        }
        return node;
      }
    

    public static void main(String args[]){
        Node root=new Node(10);
        
        Node twenty=new Node(20);
        root.children.add(twenty);

        Node thirty=new Node(30);
        root.children.add(thirty);

        Node fourty=new Node(40);
        root.children.add(fourty);

        Node fifty=new Node(50);
        twenty.children.add(fifty);

        Node sixty = new Node(60);
        twenty.children.add(sixty);

        Node seventy = new Node(70);
        thirty.children.add(seventy);

        Node eighty = new Node(80);
        thirty.children.add(eighty);

        Node ninety = new Node(90);
        thirty.children.add(ninety);

        Node hundred = new Node(100);
        fourty.children.add(hundred);

        Node hundredten = new Node(110);
        eighty.children.add(hundredten);

        Node hundredtwenty = new Node(120);
        eighty.children.add(hundredtwenty);



    }
}
