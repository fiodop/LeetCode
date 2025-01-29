import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class MajorityElement {
    public static void main(String[] args) {
        int[] n = new int[]{2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(n));
    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> numsArr = new HashMap<>();
        for(int num: nums){
            numsArr.put(num, numsArr.getOrDefault(num, 1) + 1);
        }
        Set<Integer> keys = numsArr.keySet();
        int max = nums[0];
        for(int key : keys){
            if(numsArr.get(max) < numsArr.get(key)){
                max = key;
            }
        }
        return max;
    }
}
