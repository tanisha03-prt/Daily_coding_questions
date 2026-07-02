package FA_9;
import java.util.*;

public class sorted_intersection_of_two_lists {
    public static Node findIntersection(Node head1, Node head2) {

    HashSet<Integer>set = new HashSet<>();
    TreeSet<Integer>result = new TreeSet<>();
    Node temp = head1;
    while(temp!=null){
        set.add(temp.data);
        temp = temp.next;
    }
    temp = head2;
    while(temp!=null){
        if(set.contains(temp.data)){
            result.add(temp.data);
        }
        temp = temp.next;
    }
    Node dummy = new Node(0);
    Node curr = dummy;
    for(int val:result){
        curr.next = new Node(val);
        curr = curr.next;
    }
    return dummy.next;
}
    
}
