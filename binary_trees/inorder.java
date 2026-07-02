package binary_trees;

class Node{
    int data;
    Node right,left;
    Node(int data){
        this.data = data;
    }
}
public class inorder {
    static void inorderData(Node root){
        if(root == null) return;
        inorderData(root.left);
        System.out.println(root.data + " ");
        inorderData(root.right);
    }
}
