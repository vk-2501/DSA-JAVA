import java.util.*;

public class RemoveLeaves {
    public static class Node{
        int data;
        ArrayList<Node> children=new ArrayList<>();//bhoolna mat

        Node(int data){
            this.data=data;
        }

    }

    public static void removeLeaves(Node node) {
        // write your code here
    
        //work
        for(int i=node.children.size()-1;i>=0;i--){
          Node child=node.children.get(i);
    
          if(child.children.size()==0){
            node.children.remove(i);
          }
    
    
        }
        //call
        for(Node child:node.children){
          removeLeaves(child);
        }
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




//This is wrong
// public static void removeLeaves(Node node) {
//     // write your code here

//      //call
//      for(Node child:node.children){
//         removeLeaves(child);
//       }

//     //work
//     for(int i=node.children.size()-1;i>=0;i--){
//       Node child=node.children.get(i);

//       if(child.children.size()==0){
//         node.children.remove(i);
//       }


//     }
  
//  }


//SUBTLE THINGS TO REMEMBER

//1.if did work a postorderly then it will remove all nodes and will just give root node
//2.Remove items from backwards in an arrayList