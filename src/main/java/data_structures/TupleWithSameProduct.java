package data_structures;

import java.util.ArrayList;
import java.util.HashMap;



public class TupleWithSameProduct {
    public static void main(String[] args) {
        int[] answ = new int[]{2,3,4,6};
        System.out.println(tupleSameProduct(answ));
    }

    public static int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> pairs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                pairs.put(product, pairs.getOrDefault(product, 0) + 1);
            }
        }
        int answ = 0;
        for (int count : pairs.values()) {
            if (count > 1) {
                answ += count * (count - 1) * 4;
            }
        }
        return answ;
    }

}
//2, 3, 4, 6