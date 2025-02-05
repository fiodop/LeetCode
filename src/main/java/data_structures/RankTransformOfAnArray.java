package data_structures;

import java.util.*;

public class RankTransformOfAnArray {
    public int[] arrayRankTransform(int[] arr) {
        int[] rank = new int[arr.length];
        int[]sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rankIndex = 1;
        for(int num : sortedArr){
            if(!rankMap.containsKey(num)){
                rankMap.put(num, rankIndex++);
            }
        }
        for(int i = 0; i < arr.length; i++){
            rank[i] = rankMap.get(arr[i]);
        }
        return rank;
    }
}
/*
4, 1, 1, 2, 3
sort
1, 1, 2, 3, 4
 */