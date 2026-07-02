package recursion;

public class permutation_using_boolean_array {
    static void permute(String str, String ans, boolean[] used){
        if(ans.length() == str.length()){
            System.out.println(ans);
            return;
        }

        for(int i = 0; i < str.length(); i++){
            if(!used[i]){
                used[i] = true;
                permute(str, ans + str.charAt(i), used);
                used[i] = false; // backtrack
            }
        }
    }

    public static void main(String[] args){
        String str = "abc";
        boolean[] used = new boolean[str.length()];
        permute(str, "", used);
    }
    
}
