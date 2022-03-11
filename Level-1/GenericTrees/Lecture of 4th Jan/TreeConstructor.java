import java.io.*;
import java.util.*;

public class Main {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {
    Node root=null;
    Stack<Node> st=new Stack<>();

    for(int val:arr){
     if(val!=-1){
        Node newno=new Node();
        newno.data=val;
        st.push(newno);
     }  
     else{
        Node popped=st.pop();
        if(st.size()>0){
            Node parent=st.peek();
            parent.children.add(popped);
        }
        else{
            root=popped;
        }
     } 
    }
    return root;
  }

  

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);
    levelOrderLinewise(root);
  }

}