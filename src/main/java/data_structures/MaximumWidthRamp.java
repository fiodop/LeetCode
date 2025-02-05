package data_structures;

import java.util.Arrays;

public class MaximumWidthRamp {
    public static void main(String[] args) {
        int[] arr = new int[]{9,8,1,0,1,9,4,0,4,1};

        System.out.println(maxWidthRamp(arr));
    }
//    public static int maxWidthRamp(int[] nums) {
//        int maxRamp = 0;
//        int[] rampIndex = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for(int j = i + 1; j < nums.length; j++){
//                if(nums[i] <= nums[j]){
//                    if(maxRamp < j - i){
//                        maxRamp = j - i;
//
//                        rampIndex[0] = i;
//                        rampIndex[1] = j;
//                    }
//                }
//            }
//        }
//
//        return rampIndex[1] - rampIndex[0];
//    }

    public static int maxWidthRamp(int[] nums) {
        int n = nums.length;
        int[] leftMin = new int[n];
        int[] rightMax = new int[n];

        leftMin[0] = nums[0];
        for (int i = 1; i < n; i++) {
            leftMin[i] = Math.min(leftMin[i - 1], nums[i]);
        }

        rightMax[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], nums[i]);
        }

        int answ = 0;
        int i = 0;
        int j = 0;
        while (i < n && j < n) {
            if (leftMin[i] <= rightMax[j]) {
                answ = Math.max(answ, j - i);
                j++;
            } else {
                i++;
            }
        }

        return answ;
    }

}

//9,8,1,0,1,9,4,0,4,1
//9,9,9,9,9,9,4,4,4,1