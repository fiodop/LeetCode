import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 2}, 2)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequeentNums = new HashMap<>();

        for(int num : nums){
            frequeentNums.put(num, frequeentNums.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(frequeentNums.values());
        Collections.sort(list);
        int[] answ = new int[k];
        for(int i = 0; i < k; i++){
            for (Integer key : frequeentNums.keySet()){
                if(Objects.equals(frequeentNums.get(key), list.get(list.size() - 1 - i))){
                    answ[i] = key;
                }
            }
        }
        return answ;
    }
}
