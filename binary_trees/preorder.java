package binary_trees;
class Node{
    int data;
    Node right;
    Node left;
    Node(int data){
        this.data = data;
    }
}

public class preorder {
    static void preorderdata(Node root){
        if(root == null) return;

        System.out.println(root.data + " ");
        preorderdata(root.left);
        preorderdata(root.right);
    }
    
}
