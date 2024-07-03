import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }
    public static String reverseVowels(String s) {
        Set<Character> characterSet = new HashSet<>();
        characterSet.add('a');
        characterSet.add('e');
        characterSet.add('i');
        characterSet.add('o');
        characterSet.add('u');
        characterSet.add('A');
        characterSet.add('E');
        characterSet.add('I');
        characterSet.add('O');
        characterSet.add('U');


        char tmp;
        int flag1 = 0;
        int flag2 = s.length() - 1;
        char[] chars = s.toCharArray();
        while (flag1 < flag2){
            if (!characterSet.contains(chars[flag1])){
                flag1++;
                continue;
            }
            if(!characterSet.contains(chars[flag2])){
                flag2--;
                continue;
            }


            tmp = chars[flag1];
            chars[flag1] = chars[flag2];
            chars[flag2] = tmp;

            flag1++;
            flag2--;
        }
        return new String(chars);
    }
}
