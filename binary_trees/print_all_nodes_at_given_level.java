package binary_trees;
import java.util.*;
public class print_all_nodes_at_given_level {
    static void printLevel(Node root,int targetLevel){
        if(root == null){
            System.out.print(-1);
            return;
        }
        Queue<Node>q = new LinkedList<>();
        q.add(root);
        int level = 0;
        while(!q.isEmpty()){
            int size = q.size();
            if(level == targetLevel){
                for(int i=0;i<size;i++){
                    Node curr = q.poll();
                    System.out.print(curr.data + " ");
                }
                return;
            }
            for(int i=0;i<size;i++){
                Node curr = q.poll();
                if(curr.left !=null) q.add(curr.left);
                if(curr.right !=null) q.add(curr.right);
            }
            level ++;
        }
        System.out.print(-1);
    }
}
