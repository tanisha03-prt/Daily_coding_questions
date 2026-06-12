package binary_trees;

public class maxximum_path_sum {
    int maxSum = Integer.MIN_VALUE;

    int maxPath(Node root){
        if(root == null) return 0;

        int left = Math.max(0,maxPath(root.left));
        int right = Math.max(0,maxPath(root.right));

        maxSum = Math.max(maxSum,left+right+root.data);

        return root.data + Math.max(left,right);
    }
}
