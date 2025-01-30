package data_structures;

import java.util.HashMap;

public class FourSum2 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> tuples = new HashMap<>();
        int cnt = 0;

        for(int a : nums1){
            for(int b: nums2){
                int sum = a + b;
                tuples.put(sum, tuples.getOrDefault(sum, 0) + 1);
            }
        }

        for(int c : nums3){
            for(int d : nums4){
                int complement = - (c + d);

                if(tuples.containsKey(complement)){
                    cnt += tuples.get(complement);
                }
            }


        }
        return cnt;
    }

}
