package binary_trees;

public class mirror_tree {
    Node mirror(Node root){
        if(root == null) return null;
        Node left = mirror(root.left);
        Node right = mirror(root.right);

        root.right = left;
        root.left = right;
        return root;
    }
}
