public class permutation {
    static void permute(String s,String ans){
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            String rest = s.substring(0,i) + s.substring(i+1);
            permute(rest,ans+ch);
        }
    }
    public static void main(String[] args){
        permute("ab", "");
    }
    
}
