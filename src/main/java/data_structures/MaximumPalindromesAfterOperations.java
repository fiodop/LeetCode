package data_structures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class MaximumPalindromesAfterOperations {
    public int maxPalindromesAfterOperations(String[] words) {
        HashMap<Character, Integer> lettersCount = new HashMap<>();
        for (String word : words) {
            for(char letter : word.toCharArray()) {
                lettersCount.put(letter, lettersCount.getOrDefault(letter, 0) + 1);
            }
        }

        int pairsCnt = 0;

        for(Character letter : lettersCount.keySet()) {
            pairsCnt += lettersCount.get(letter) / 2;
        }

        int palindromesCnt = 0;

        StringLengthSort sort = new StringLengthSort();
        Arrays.sort(words, sort);

        for(String word : words) {
            if(word.length() / 2 <= pairsCnt){
                palindromesCnt++;
                pairsCnt -= word.length() / 2;
            } else {
                return palindromesCnt;
            }
        }
        return palindromesCnt;
    }
}

class StringLengthSort implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
    }
}