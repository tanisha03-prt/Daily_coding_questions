package recursion;

public class all_subsequence_in_string {
    static void subsequence(int i, String str, String ans){
        if(i == str.length()){
            System.out.println(ans);
            return;
        }
        subsequence(i+1,str,ans+str.charAt(i));
        subsequence(i+1,str,ans);
    }
    public static void main(String[] args){
        String str = "abc";
        subsequence(0, str, "");
    }
}
