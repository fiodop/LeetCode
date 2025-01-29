package data_structures;

public class PrimeSubOperation {
    public boolean primeSubOperation(int[] nums) {
        for(int i = 1; i < nums.length - 1; i++){
            if(nums[i + 1] < nums[i - 1]){
                return false;
            }
        }
        return true;
    }

    private boolean isArrStrictlyIncreasing(int[] nums){
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i - 1]){
                return false;
            }
        }
        return true;
    }
}
//4,9,6,10