import java.util.Arrays;

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        int[] arr = {4,2,1,3,3};
        System.out.println(findMaxAverage(arr, 2));
    }
    public static double findMaxAverage(int[] nums, int k){
        double max = 0;
        for(int i = 0; i < k; i++){
            max += nums[i];
        }
        double tmp = max;
        int flag2 = 0;
        for(int i = k; i < nums.length; i++){
            if(max < tmp - nums[flag2] + nums[i]){
                max = tmp - nums[flag2] + nums[i];
            }
            tmp +=- nums[flag2] + nums[i];
            flag2++;
        }
        return max / k;
    }

}
