package data_structures;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            numsSet.add(num);
        }

        int max = 0;
        for (int num : numsSet) {
            if (!numsSet.contains(num - 1)) {
                int tmp = num;
                int cnt = 1;

                while (numsSet.contains(tmp + 1)) {
                    tmp++;
                    cnt++;
                }

                max = Math.max(max, cnt);
            }
        }
        return max;
    }
}
