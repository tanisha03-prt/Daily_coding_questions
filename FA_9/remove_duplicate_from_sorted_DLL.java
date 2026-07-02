package FA_9;

public class remove_duplicate_from_sorted_DLL {
    static Node removeDuplicate(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node curr = head;
        while(curr!=null && curr.next!=null){
            if(curr.data == curr.next.data){
                curr.next = curr.next.next;

                if(curr.next != null){
                    curr.next.prev = curr;
                }
            }
            else{
                curr = curr.next;
            }
        }
        return head;
    }
}
