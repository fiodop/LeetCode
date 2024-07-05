public class LongestSubarrayOf1sAfterDeletingOneElement {
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,0,1,1,0,1};
        System.out.println(longestSubarray(arr));
    }
    public static int longestSubarray(int[] nums) {
        boolean allOnes = true;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                allOnes = false;
            }
        }

        if(allOnes){
            return nums.length - 1;
        }

        int left = 0;
        int right = 0;
        int zeroCnt = 0;
        int maxLength = 0;

        while (right < nums.length){
            if(nums[right] == 0){
                zeroCnt++;
            }

            while (zeroCnt > 1){
                if(nums[left] == 0){
                    zeroCnt--;
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left);
            right++;
        }
        return maxLength;
    }
}
//0,1,1,1,0,1,1,0,1