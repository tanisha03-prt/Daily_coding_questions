package binary_search_trees;

public class deletion_in_bst {
    Node deletion(Node root,int key){
        if(root == null) return null;
        if(key<root.data){
            root.left = delete(root.left,key);
        }else if(key > root.data){
            root.right = delete(root.right,key);
        }else{
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;

            Node min = findMin(root.right);
            root.data = min.data;
            root.right = delete(root.right,min.data);
        } 
        return root;
    }
    Node findMin(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    
}
