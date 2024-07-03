import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] answLeft = new int[nums.length];
        int[] answRight = new int[nums.length];
        int[] answ = new int[nums.length];

        answLeft[0] = 1;
        for(int i = 1; i < nums.length; i++){
            answLeft[i] = answLeft[i - 1] * nums[i - 1];
        }

        answRight[nums.length - 1] = 1;
        for(int i = nums.length - 2; i >= 0 ; i--){
            answRight[i] = answRight[i + 1] * nums[i + 1];
        }

        for(int i = 0; i < nums.length; i++){
            answ[i] = answLeft[i] * answRight[i];
        }
        return answ;
    }
}
