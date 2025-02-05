package data_structures;

public class SwapOneLetterInStrings {
    public static void main(String[] args) {

        System.out.println(areAlmostEqual("abba", "baba"));
    }
    public static boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        int diffCnt = 0;
        int firstChar = -1;
        int secondChar = -1;
        for(int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diffCnt++;
                if (diffCnt > 2) return false;

                if (firstChar == -1) {
                    firstChar = i;
                } else secondChar = i;
            }
        }

        return diffCnt == 2 && s1.charAt(firstChar) == s2.charAt(secondChar) && s1.charAt(secondChar) == s2.charAt(firstChar);
    }
}

//abba | baba