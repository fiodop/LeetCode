package data_structures;

public class LongestStrictlyIncreasingorStrictlyDecreasingSubArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 2};

        System.out.println(longestMonotonicSubarray(arr));


    }
    public static int longestMonotonicSubarray(int[] nums) {
        int dec = 1;
        int inc = 1;
        int maxLength = 1;

        if(nums.length == 0){
            return 0;
        }
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i-1]){
                inc = dec + 1;
                dec = 1;
            } else if(nums[i] < nums[i-1]){
                dec = inc + 1;
                inc = 1;
            } else {
                inc = 1;
                dec = 1;
            }
            maxLength = Math.max(maxLength, inc);
        }
        return maxLength;
    }
}
