import java.util.HashSet;
import java.util.Set;

public class CounTheNumberOfConsistentStrings {
    public static void main(String[] args) {
        System.out.println(countConsistentStrings("ab",new String[] {"ad","bd","aaab","baa","badab"}));
    }
    public static int countConsistentStrings(String allowed, String[] words) {
        int cnt = 0;
        boolean a = true;
        Set<Character> allowedChars = new HashSet<>();
        for(char ch : allowed.toCharArray()){
            allowedChars.add(ch);
        }

        for(String word : words){
            Set<Character> characters = new HashSet<>();
            for(char ch : word.toCharArray()){
                if (!allowedChars.contains(ch)){
                    a = false;
                    break;
                }
            }
            if(a){
                cnt++;
            }
        }
        return cnt;
    }
}
