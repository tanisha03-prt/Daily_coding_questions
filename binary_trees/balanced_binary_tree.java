package binary_trees;

public class balanced_binary_tree {
    boolean isBalanced(Node root){
        return check(root) != -1;

    }
    int check(Node root){
        if(root == null) return 0;

        int left = check(root.left);
        if(left == -1) return -1;

        int right = check(root.right);
        if(right == -1) return -1;


        if(Math.abs(right - left) > 1) return -1;

        return 1 + Math.max(left,right);
    }
}

