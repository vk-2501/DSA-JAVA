public class Size {
    public static int size(Node node){
        if(node==null){
            return 0;
        }
        
        int l=size(node.left);
        int r=size(node.right);
        
       return l+r+1;
    }
}
