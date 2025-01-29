package data_structures;

import java.util.ArrayList;

public class CircularSentence {
    public static void main(String[] args) {
        System.out.println(isCircularSentence("ssq"));
    }
    public static boolean isCircularSentence(String sentence) {
        if(sentence.charAt(0) != sentence.charAt(sentence.length() - 1)){
            return false;
        }

        char tmp = sentence.charAt(0);
        for(int i = 1; i < sentence.length(); i++){
            if (sentence.charAt(i) == ' ' && sentence.charAt(i - 1) != sentence.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
