import java.util.ArrayList;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public static void main(String[] args) {
        String s = "abciiidef";
        System.out.println(maxVowels(s, 3));
    }


    public static int maxVowels(String s, int k) {
        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int max = 0;

        for(int i = 0; i < k; i++){
            if(vowels.contains(s.charAt(i))){
                max++;
            }
        }
        int tmp = max;
        int flag1 = 0;
        for(int i = k; i < s.length(); i++){
            if(vowels.contains(s.charAt(i))){
                tmp++;
            }
            if(vowels.contains(s.charAt(flag1))){
                tmp--;
            }

            if(tmp > max){
                max = tmp;
            }
            flag1++;
        }
        return max;
    }
}
//'a', 'e', 'i', 'o', and 'u'