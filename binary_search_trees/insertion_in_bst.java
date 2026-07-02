package binary_search_trees;

public class insertion_in_bst {
    Node insert(Node root,int key){
        if(root == null) return new Node(key);
        if(key<root.data){
            root.left = insert(root.left,key);
        }else{
            root.right = insert(root.right,key);
        }
        return root;
    }
}
