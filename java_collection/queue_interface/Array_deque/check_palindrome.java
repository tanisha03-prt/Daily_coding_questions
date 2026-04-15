package java_collection.queue.queue_interface.Array_deque;
import java.util.*;

public class check_palindrome {
    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        dq.add(1);
        dq.add(2);
        dq.add(3);
        dq.add(2);
        dq.add(1);

        boolean isPalindrome = true;
        while(dq.size() > 1){
            int x = dq.removeFirst();
            int y = dq.removeLast();
            if(x != y){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
