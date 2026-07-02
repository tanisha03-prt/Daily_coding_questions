package binary_trees;

public class maximum_element {
    int findMax(Node root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.data, Math.max(findMax(root.left), findMax(root.right)));
    }
    
}
