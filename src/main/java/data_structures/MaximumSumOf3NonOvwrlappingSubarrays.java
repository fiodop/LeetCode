package data_structures;

public class MaximumSumOf3NonOvwrlappingSubarrays {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int r = 0;
        int l = k - 1;
        int[] sums = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length - k; i++) {
            for(int j = 0; j < k; j++) {
                sums[i] += nums[i];
            }
        }
        return new int[]{1, 2};
    }
}
