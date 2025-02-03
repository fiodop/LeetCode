package data_structures;

public class CheckIfArrayIsSortedAndRotated {
    public boolean check(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                cnt++;
            }
        }
        if(cnt == 1 && nums[0] > nums[nums.length - 1] || cnt == 0) { return  true; }
        return false;
    }
}

//[3, 4, 5, 6, 2, 1]