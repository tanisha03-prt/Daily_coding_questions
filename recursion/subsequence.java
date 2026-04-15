package recursion;

public class subsequence {
    public static void subsequence(String s,String empty){
        if(s.length()==0){
            System.out.print(empty);
            return;
        }
        char ch =s.charAt(0);
        String rest = s.substring(1);
        
        subsequence(rest,empty);
        subsequence(rest,empty+ch);
 
    }
    
    public static void main(String[] args) {
        subsequence("acgr", "");
        
        
    }
    
}
