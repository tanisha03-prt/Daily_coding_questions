package java_collection.map_interface;
import java.util.*;
public class first_non_repeating_element {
    int[] arr = {12,6,3,4,7,45,7};
    HashMap<Integer,Integer>map = new HashMap<>();
    for(int num : arr){
        map.put(num,map.getOrDefault(num,0)+1);
    }
    for(int num : arr){
        if(map.get(num) == 1){
            System.out.println(num);
            break;
        }
    }
}
