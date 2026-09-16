package Strings;
import java.util.*;
public class character_frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] freq = new int[26];
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }
    }
}
