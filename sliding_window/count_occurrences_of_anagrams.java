package sliding_window;
import java.util.*;
public class count_occurrences_of_anagrams {
    public int count(String txt,String pat){
        HashMap<Character,Integer> Pmap = new HashMap<>();
        HashMap<Character,Integer> map = new HashMap<>();
        int n = pat.length();
        for(int i=0;i<n;i++){
            Pmap.put(pat.charAt(i),Pmap.getOrDefault(pat.charAt(i),0)+1);
        }
        int left = 0;
        int count = 0;
        for(int right =0;right<txt.length();right++){
            char ch = txt.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(right-left+1 > n){
                char c = txt.charAt(left);
                map.put(c,map.get(c)-1);
                if(map.get(c) == 0){
                    map.remove(c);
                }
                left++;
            }
            if(right-left+1 == n){
                if(map.equals(Pmap)){
                    count++;
                }
            }
        }
        return count;
    }
}
