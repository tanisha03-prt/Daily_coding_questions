package greedy;
public class breakPalindrome {
    public String breakpalindrome(String palindrome) {
        int n = palindrome.length();
        if (n == 1) {
            return "";
        }
        for (int i = 0; i < n / 2; i++) {
            if (palindrome.charAt(i) != 'a') {
                char[] arr = palindrome.toCharArray();
                arr[i] = 'a';
                return new String(arr);
            }
        }
        char[] arr = palindrome.toCharArray();
        arr[n - 1] = 'b';
        return new String(arr);
    }
}
