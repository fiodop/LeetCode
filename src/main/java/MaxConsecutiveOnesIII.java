import java.awt.desktop.PreferencesEvent;

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};

        System.out.println(longestOnes(arr, 2));
    }
    public static int longestOnes(int[] nums, int k) {
        int left = 0; int right = 0; int maxLength = 0; int zeroCnt = 0;

        while (right < nums.length){
            if(nums[right] == 0){
                zeroCnt++;
            }
            while (zeroCnt > k){
                if(nums[left] == 0){
                    zeroCnt--;
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }
}
//1,1,1,0,0,0,1,1,1,1,0
// k = 2