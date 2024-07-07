import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DetermineIfTwoStringsAreClose {
    public static void main(String[] args) {
        System.out.println(closeStrings("uau", "ssx"));
    }
    public static boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }
        Map<Character, Integer> char1Index = new HashMap<>();
        Map<Character, Integer> char2Index = new HashMap<>();
        for(int i = 0; i < word1.length(); i++){
                char1Index.put(word1.charAt(i), char1Index.getOrDefault(word1.charAt(i), 0) + 1);
                char2Index.put(word2.charAt(i), char2Index.getOrDefault(word2.charAt(i),0) + 1);
        }
        if (!char1Index.keySet().equals(char2Index.keySet())){
            return false;
        }
        ArrayList<Integer> arr1 = new ArrayList<>(char1Index.values());
        ArrayList<Integer> arr2 = new ArrayList<>(char2Index.values());
        Collections.sort(arr1);
        Collections.sort(arr2);
        if(arr1.equals(arr2)){
            return true;
        }
        else {
            return false;
        }
    }
}
//abc
//acb

// b-1, c-2;
// c-1, b-2;