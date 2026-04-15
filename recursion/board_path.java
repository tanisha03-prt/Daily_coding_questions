public class board_path {
    static void board(int curr, int end, String ans){
        if(curr == end){
            System.out.println(ans);
            return ;
        }
        if(curr > end) return;
        for(int dice = 1; dice<=6; dice++){
            board(curr+dice, end, ans+dice);
        }
    }
    public static void main(String[] args){
        board(0,3,"");
    }
    
}
