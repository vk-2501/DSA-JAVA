import java.util.*;

public class Mirror {
    public static class Node{
        int data;
        ArrayList<Node> children=new ArrayList<>();//bhoolna mat

        Node(int data){
            this.data=data;
        }

    }

  

    public static void mirror(Node node){
        for(Node child:node.children){
            mirror(child);
          }
      
          Collections.reverse(node.children);
        
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
