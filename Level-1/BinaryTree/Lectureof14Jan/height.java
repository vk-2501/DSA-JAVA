public class height {
    public static int height(Node node){
        if(node==null){
            return -1;
        }
        
        int ls=height(node.left);
        int rs=height(node.right);
        
        return Math.max(ls,rs)+1;
    }
   
}
