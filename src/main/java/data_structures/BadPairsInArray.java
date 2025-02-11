package data_structures;

import java.util.ArrayList;
import java.util.HashMap;

public class BadPairsInArray {
    public long countBadPairs(int[] nums) {
        HashMap<Integer, Integer> goodPairsMap = new HashMap<>();
        long goodPairs = 0;

        long allPairs = (long) nums.length *(nums.length - 1) / 2;
        for(int i = 0; i < nums.length; i++){
            int key = nums[i] - i;
            goodPairs += goodPairsMap.getOrDefault(key, 0);
            goodPairsMap.put(key, goodPairsMap.getOrDefault(key, 0) + 1);
        }


        return allPairs - goodPairs;
    }
}
