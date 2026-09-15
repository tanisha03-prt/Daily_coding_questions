package Strings;

public class length_of_last_word {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        // trailing spaces skip karo
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        int count = 0;
        // last word count karo
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }
        return count;
    }
}
