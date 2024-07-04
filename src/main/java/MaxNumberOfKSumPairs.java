import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxNumberOfKSumPairs {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,3};
        System.out.println(maxOperations(nums, 6));
    }
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int leftFlag = 0;
        int rightFlag = nums.length - 1;
        int cnt = 0;

        while (leftFlag < rightFlag){
            if(nums[leftFlag] + nums[rightFlag] == k){
                cnt++;
                leftFlag++;
                rightFlag--;
            } else if (nums[leftFlag] + nums[rightFlag] > k) {
                rightFlag--;
            } else if (nums[leftFlag] + nums[rightFlag] < k) {
                leftFlag++;

            }
        }
        return cnt;
    }
}
// 1 2 3 3 2 1 3 4