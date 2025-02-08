package data_structures;

import java.util.HashMap;
import java.util.TreeSet;

public class NumberContainers {
    private final HashMap<Integer, Integer> indexToNumbers;
    private final HashMap<Integer, TreeSet<Integer>> numberToIndexes;

    public NumberContainers() {
        indexToNumbers = new HashMap<>();
        numberToIndexes = new HashMap<>();

    }

    public void change(int index, int number) {
        if(indexToNumbers.containsKey(index)) {
            int oldNumber = indexToNumbers.get(index);
            numberToIndexes.remove(oldNumber);

            if(numberToIndexes.get(oldNumber).isEmpty()){
                numberToIndexes.remove(oldNumber);
            }
        }

        indexToNumbers.put(index, number);
        numberToIndexes.putIfAbsent(number, new TreeSet<>());
        numberToIndexes.get(number).add(index);
    }

    public int find(int number) {
        if(!numberToIndexes.containsKey(number) || numberToIndexes.get(number).isEmpty()) {
            return -1;
        }
        return numberToIndexes.get(number).first();
    }
}
