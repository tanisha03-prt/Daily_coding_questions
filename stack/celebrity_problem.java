package stack;

public class celebrity_problem {
    static int findCelebrity(int[][] M, int n){
    int a = 0;
    int b = n-1;
    while(a<b){
        if(M[a][b] == 1){
            a++;
        }else{
            b--;
        }
        int candidate = a;
        for(int i=0;i<n;i++){
            if(i!=candidate){
                if(M[candidate][i] == 1 || M[i][candidate] == 0){
                    return -1;
                }
            }
        }
        return candidate;
    }
}
    public static void main(String[] args) {
        
    }
    
}
