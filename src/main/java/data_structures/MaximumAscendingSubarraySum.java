package data_structures;

public class MaximumAscendingSubarraySum {
    public static void main(String[] args) {
        int[] arr = {12,17,15,13,10,11,12};
        System.out.println(maxAscendingSum(arr));
    }
    public static int maxAscendingSum(int[] nums) {
        int sum = 0;
        int tmpSum = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i-1]) {
                tmpSum += nums[i];
                if(tmpSum > sum) {
                    sum = tmpSum;
                }
            } else {
                tmpSum = nums[i];
            }
            System.out.println("Текущее значение: "+ nums[i]);
            System.out.println("Текущая сумма: "+ sum);
        }

        if(tmpSum > sum) {
            sum = tmpSum;
        }
        return sum;
    }
}
