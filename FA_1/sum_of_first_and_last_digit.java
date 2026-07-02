package FA_1;

public class sum_of_first_and_last_digit {
    public static void main(String[] args) {
        int n = 12343;
        int last = n%10;
        while(n>=10){
            n=n/10;
        }
        int first = n;
        System.out.println(first+last);
    }
}
