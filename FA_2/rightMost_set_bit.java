package FA_2;

public class rightMost_set_bit {
    static int rightMostSetBit(int n){
        if(n==0) return -1;
        int pos = 0;
        while((n&1) == 0){
            n >>= 1;
            pos++;
        }
        return pos;
    }
    
}
