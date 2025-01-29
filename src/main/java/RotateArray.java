import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] test = new int[]{1,2,3,4,5,6,7};
        rotate(test, 3);
    }
    public static void rotate(int[] nums, int k) {
        int[] subArr1 = new int[k];
        int[] subArr2 = new int[nums.length - k];
        int index = 0;
        int[] rotatedArr = new int[nums.length];
        for(int i = k; i > 0; i--){
            subArr1[index] = nums[nums.length - i];

            rotatedArr[index] = nums[nums.length - i];
            index++;
        }
        for(int i = 0; i < nums.length - subArr1.length; i++){
            subArr2[i] = nums[i];
        }

        for (int i = 0; i < subArr1.length; i++){
            rotatedArr[i] = subArr1[i];
        }
        index = 0;

        for (int i = subArr1.length; i < nums.length; i++){
            rotatedArr[i] = subArr2[index];
        }

        System.out.println(Arrays.toString(rotatedArr));
    }
}
