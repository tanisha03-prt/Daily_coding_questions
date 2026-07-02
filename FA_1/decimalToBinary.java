package FA_1;

public class decimalToBinary {
    static int decTobinary(int n){
        if(n == 0) return 0;
        return decTobinary(n/2) * 10 + (n%2);
    }
}
