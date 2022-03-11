public class Display {
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
}
