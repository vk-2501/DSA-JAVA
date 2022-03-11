public class Max {
    public static int max(Node node){
        if(node==null){
            return Integer.MIN_VALUE;
        }
        
        int ls=max(node.left);
        int rs=max(node.right);
        
        return Math.max(Math.max(ls,rs),node.data);
    }
}
