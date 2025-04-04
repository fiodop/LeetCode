import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r){
                if (l == i){
                    l++;
                }

                if(r == i){
                    r--;
                }
                if(nums[i] + nums[l] + nums[r] == 0){
                    List<Integer> answ = List.of(nums[i], nums[l], nums[r]);
                    res.add(answ);
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    l++;
                    r--;
                } else if(nums[i] + nums[l] + nums[r] < 0){
                    l++;
                } else if(nums[i] + nums[l] + nums[r] > 0){
                    r--;
                }
            }
        }
        return res;
    }
}
