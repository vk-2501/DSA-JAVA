public class Sum {
    public static int sum(Node node){
        if(node==null){
            return 0;
        }
        
        int ls=sum(node.left);
        int rs=sum(node.right);
        
        return ls+rs+node.data;
    }
}
