package data_structures;

import java.util.ArrayList;
import java.util.List;

public class CheckIfWordOccursPrefix {
    public int isPrefixOfWord(String sentence, String searchWord) {
        ArrayList<String> words = new ArrayList<>(List.of(sentence.split(" ")));
        for(int i = 0; i < words.size(); i++){
            if(words.get(i).startsWith(searchWord)){
                return i + 1;
            }
        }

        return -1;
    }
}
