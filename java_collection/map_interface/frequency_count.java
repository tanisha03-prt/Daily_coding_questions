package java_collection.map_interface;
import java.util.*;
public class frequency_count {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,67,4};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int key:map.keySet()){
            System.out.println(map.get(key));
        }
    }
}
