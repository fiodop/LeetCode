import java.util.Stack;

public class RemovingStarsFromAString {
    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e"));
    }

    public static String removeStars(String s) {
        Stack<Character> characters = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '*'){
                characters.pop();
            } else {
                characters.add(s.charAt(i));
            }
        }
        StringBuilder answ = new StringBuilder();
        for (int i = 0; i < characters.size(); i++){
            answ.append(characters.get(i));
        }
        return answ.toString();
    }
}
//"leet**cod*e"