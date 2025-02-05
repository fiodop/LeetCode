package data_structures;

import java.util.Arrays;

public class FindThePowerOfKSizeSubArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,5};
        System.out.println(Arrays.toString(resultsArray(arr, 3)));
    }
    public static int[] resultsArray(int[] nums, int k) {
        int[] subArr = new int[k];
        int[] answ = new int[nums.length - k + 1];
        for(int i = 0; i < nums.length - k + 1; i++){
            for (int j = 0; j < k; j++){
                subArr[j] = nums[i + j];
            }
            System.out.println("Текущий подмассив: " + Arrays.toString(subArr));
            if (isArrayConsecutive(subArr)){
                answ[i] = findMaxInArray(subArr);

            } else {
                answ[i] = -1;
            }
        }

        return answ;
    }

    private static int findMaxInArray(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        return max;
    }

    private static boolean isArrayConsecutive(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] - arr[i - 1] == 1){
                return false;
            }
        }
        return true;
    }
}
