package binary_trees;

public class height {
    int height_of_tree(Node root){
        if(root == null) return 0;
        int lh = height_of_tree(root.left);
        int rh = height_of_tree(root.right);
        return 1 + Math.max(lh,rh);
    }
}
