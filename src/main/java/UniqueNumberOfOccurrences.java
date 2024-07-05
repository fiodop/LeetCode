import java.util.*;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        Set<Integer> set = new HashSet<>();

        for(int cnt : map.values()){
            if(!set.add(cnt)){
                return false;
            }
        }

        return true;
    }
}
