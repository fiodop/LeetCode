package data_structures;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] answ = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            answ[i] = nums[i] * nums[i];
        }
        Arrays.sort(answ);
        return answ;
    }
}
