package FA_9;
import java.util.*;
public class reverse_alternate_k_nodes {
    static Node revAltKNodes(Node head,int k){
        if(head == null) return null;
        Node curr = head;
        Node prev = null;
        Node next = null;
        int count = 0;
        while(curr!=null && count < k){  // reverse first k nodes
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

            count++;
        }
        head.next = curr;  // connect first part

        // skip next k nodes
        count = 0; 
        while(count < k-1 && curr !=null){
            curr = curr.next;
            count++;
        } 
        // recursive call
        if(curr != null){
            curr.next = revAltKNodes(curr.next,k);
        }
        return prev;
    }
}
