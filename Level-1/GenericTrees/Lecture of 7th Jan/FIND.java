
import java.util.*;

public class FIND {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }


  public static boolean find(Node node, int data) {
    // write your code here
    if(node.data==data){
      return true;
    }

    for(Node child:node.children){
      boolean ifyes=find(child,data);

      if(ifyes==true){
        return true;
      }
    }

    return false;
  }

  // public static void main(String[] args) throws Exception {
  //   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  //   int n = Integer.parseInt(br.readLine());
  //   int[] arr = new int[n];
  //   String[] values = br.readLine().split(" ");
  //   for (int i = 0; i < n; i++) {
  //     arr[i] = Integer.parseInt(values[i]);
  //   }

  //   int data = Integer.parseInt(br.readLine());

  //   Node root = construct(arr);
  //   boolean flag = find(root, data);
  //   System.out.println(flag);
  //   // display(root);
  // }

}