package binary_trees;
import java.util.*;
public class maximum_el_at_each_level_bt {
    static void printLevelWiseMax(Node root){
        if(root == null) return;
        Queue<Node>q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            int maxi = Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                Node curr = q.poll();
                maxi = Math.max(maxi,curr.data);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            System.out.println(maxi);
        }
    }
}
