public class count_digits {
    static int count(int n){
        if(n==0) return 1;
        if(n<10) return 1;
        return 1 + count(n/10); 
    }
    public static void main(String[] args) {
        System.out.println(count(4567435));
    }
}
