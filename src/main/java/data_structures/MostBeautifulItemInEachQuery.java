package data_structures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MostBeautifulItemInEachQuery {
        public int[] maximumBeauty(int[][] items, int[] queries) {
            int[] answ = new int[queries.length];
            HashMap<Integer, Integer> itemsMap = new HashMap<>();

            for (int i = 0; i < items.length; i++) {
                itemsMap.put(items[i][0], Math.max(itemsMap.getOrDefault(items[i][0], 0), items[i][1]));
            }

            ArrayList<Integer> arr = new ArrayList<>(itemsMap.keySet());
            Collections.sort(arr);

            for (int i = 0; i < queries.length; i++) {
                int maxBeauty = 0;
                for (int key : arr) {
                    if (key > queries[i]) break;
                    maxBeauty = Math.max(maxBeauty, itemsMap.get(key));
                }
                answ[i] = maxBeauty;
            }
            return answ;
        }
    }
//[[1,2],[3,2],[2,4],[5,6],[3,5]]