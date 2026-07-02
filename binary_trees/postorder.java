package binary_trees;

class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
    }
}
public class postorder {
    static void postorderData(Node root){
        if(root == null) return;
        postorderData(root.left);
        postorderData(root.right);
        System.out.println(root.data + " ");
    }
    
}
