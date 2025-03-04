package data_structures;

import java.util.ArrayList;
import java.util.List;

public class HappyStrings {
    public static String getHappyString(int n, int k) {
        int allHappyStrings = (int) Math.pow(2, n - 1) * 3;
        if (k > allHappyStrings) return "";

        StringBuilder str = new StringBuilder();
        char[] chars = {'a', 'b', 'c'};

        k--;

        for (int i = 0; i < n; i++) {
            int groupSize = allHappyStrings / 3;
            allHappyStrings /= 2;
            for (char c : chars) {
                if (str.length() > 0 && str.charAt(str.length() - 1) == c) continue;
                if (k < groupSize) {
                    str.append(c);
                    allHappyStrings = groupSize;
                    break;
                }
                k -= groupSize;
            }
        }

        return str.toString();
    }


}
