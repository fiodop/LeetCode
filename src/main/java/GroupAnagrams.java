import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> words = new HashMap<>();

        for (String word : strs){
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);

            String sortedStr = new String(charArray);

            if(!words.containsKey(sortedStr)){
                words.put(sortedStr, new ArrayList<>());
            }
            words.get(sortedStr).add(word);
        }

        return new ArrayList<>(words.values());
    }
}
