package greedy;

public class brokenCalc {
    public int brokencalc(int startValue, int target) {
        if(startValue >= target){
            return startValue - target;
        }
        if(target % 2 == 0){
            return 1 + brokencalc(startValue,target/2);
        }
        return 1 + brokencalc(startValue,target+1);
    }
}
