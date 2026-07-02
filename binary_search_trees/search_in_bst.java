package binary_search_trees;

public class search_in_bst {
    boolean search(Node root, int key){
        if(root == null) return false;
        if(root.data == key) return true;
        else if(key<root.data) return search(root.left,key);
        else return search(root.right,key);
    }
}
