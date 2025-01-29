public class RemoveDublicates {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for(int num : nums){
            if(k < 2 || num != nums[k-2]){
                nums[k++] = num;
            }
        }
        return k;
    }
}
//1, 1, 1, 2, 2, 3