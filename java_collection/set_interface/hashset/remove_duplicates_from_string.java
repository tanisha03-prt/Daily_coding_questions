package java_collection.queue.set_interface.hashset;

import java.util.HashSet;
import java.util.Set;

public class remove_duplicates_from_string {
    public static void main(String[] args) {
        String s = "programming";

    Set<Character> set = new HashSet<>();
     String result = "";

    for(char c : s.toCharArray()){
       if(!set.contains(c)){
        set.add(c);
        result += c;
    }
}

System.out.println(result);
    }
    
}
