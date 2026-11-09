package binary_trees;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;
public class completeness_of_bt {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
class completeness_of_bt {
    public boolean isCompleteTree(TreeNode root) {
        if(root == null) return true;
        boolean nullFound = false;
        Queue<TreeNode>q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr == null) nullFound = true;
            else{
                if(nullFound) return false;
                q.add(curr.left);
                q.add(curr.right);
            }
        }
        return true;
    }
}
