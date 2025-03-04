package data_structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MaxSumOfPairWithEqualSumOfDigits {
    public static void main(String[] args) {
        int[] arr = { 18,43,36,13,7 };
        System.out.println(maximumSum(arr));
    }

    public static int maximumSum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            int digitSum = getSumOfDigits(num);
            if (map.containsKey(digitSum)) {
                maxSum = Math.max(maxSum, map.get(digitSum) + num);
                map.put(digitSum, map.get(digitSum) + num);
            } else {
                map.put(digitSum, num);
            }
        }
        return maxSum;
    }

    private static int getSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }
}
