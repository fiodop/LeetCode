import java.util.ArrayList;
import java.util.List;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{1, 2, 3, 4}));
    }
    public static int longestConsecutive(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            list.add(nums[i]);
        }
        int tmp = list.getFirst();
        int cnt = 1;
        if(nums.length == 1){
            return 1;
        }
        int max = 1;
        for(int i = 0; i < list.size(); i++){
            if(list.contains(tmp++)) {
                tmp++;
                cnt++;
            } else if (cnt > max){
                max = cnt;
                cnt = 0;
            }
        }
        return max;
    }
}
