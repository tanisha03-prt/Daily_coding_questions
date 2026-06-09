package binary_trees;

public class ancestors {
    boolean ancestor(Node root,int target){
        if(root == null) return false;

        if(root.data == target) return true;

        if(ancestor(root.left,target) || ancestor(root.right,target)){
            System.out.println(root.data + " ");
            return true;
        }
        return false;
    }
    
}
