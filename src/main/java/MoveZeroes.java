import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = new int[] {0, 0, 1};
        moveZeroes(arr);
    }
    public static void moveZeroes(int[] nums) {
        int lastNonZeroFoundIn = 0;
        for(int i = 0;  i < nums.length; i++){
            if(nums[i] != 0){
                nums[lastNonZeroFoundIn] = nums[i];
                lastNonZeroFoundIn++;
            }
        }
        while (lastNonZeroFoundIn != nums.length){
            nums[lastNonZeroFoundIn] = 0;
            lastNonZeroFoundIn++;
        }
    }
}
