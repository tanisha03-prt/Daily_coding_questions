public class coin {
    static void cointoss(int n,String ans){
        if(n==0){
            System.out.print(ans);
            return;
        }
        cointoss(n-1,ans+"H");
        cointoss(n-1,ans+"T");
    }
    public static void main(String[] args){
        cointoss(2, " ");
    }
}
