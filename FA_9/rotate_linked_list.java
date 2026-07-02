package FA_9;
import java.util.*;
public class rotate_linked_list {
    static Node rotateList(Node head, int k){
        if(head == null || k == 0) return head;
        int count = 1;
        Node temp = head;
        // length count 
        while(temp.next!=null){
            temp = temp.next;
            count++;
        }
        if(k >= count) return head; // agar k bada hai length se

        temp.next = head; // circular banana
        Node curr = head;
        for(int i=1;i<k;i++){ // kth node tak jao
            curr = curr.next;
        }
        Node newHead = curr.next; // kth ka next --> newHead
        curr.next = null; // circular link todna
        return newHead;
    }
    
}
