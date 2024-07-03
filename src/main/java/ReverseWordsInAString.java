import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }
    public static String reverseWords(String s) {
        s = s.trim();
        List<String> words = new LinkedList<>();
        StringBuilder tmp = new StringBuilder();

        for(int i = 0; i <  s.length(); i++){
            if(s.charAt(i) == ' ') {
                if (!tmp.isEmpty()) {
                    words.add(tmp.toString().trim());
                    tmp = new StringBuilder();
                }
            }else {
                tmp.append(s.charAt(i));
            }
        }

        if(!tmp.isEmpty()){
            words.add(tmp.toString());
        }

        tmp = new StringBuilder();

        for (int i = words.size() - 1; i >= 0; i--){
            if (words.get(i).equals(" ")){
                i++;
                continue;
            }
            tmp.append(words.get(i) + " ");
        }
        return String.valueOf(tmp).trim();
    }
}
