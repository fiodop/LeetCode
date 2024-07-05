import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindTheDifferenceOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};

        System.out.println(findDifference(nums1, nums2));
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++){
            list1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++){
            list2.add(nums2[i]);
        }

        List<Integer> answ1 = new ArrayList<>();
        List<Integer> answ2 = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++){
            if(!list2.contains(list1.get(i)) && !answ1.contains(list1.get(i))){
                answ1.add(list1.get(i));
            }
        }
        for (int i = 0; i < list2.size(); i++){
            if(!list1.contains(list2.get(i)) && !answ2.contains(list2.get(i))){
                answ2.add(list2.get(i));
            }
        }

        ArrayList<List<Integer>> answ = new ArrayList<>();
        answ.add(answ1);
        answ.add(answ2);
        return answ;
    }
}
